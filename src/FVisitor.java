import calculus.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

/** Visitor to walk through the parse tree and construct the lambda calculus expression
 */
public class FVisitor extends FunlBaseVisitor<CalcExpr> {
    @Override
    public CalcExpr visitProgram(FunlParser.ProgramContext ctx) {
        // Add all function defs to global scope
        Map<String, CalcExpr> environment = new HashMap<>();

        for (FunlParser.DeclsContext decl : ctx.decls()) {
            // Name of identifier
            String name = decl.IDENT().getText();
            // Function expression
            CalcExpr funcExpr = this.visit(decl);

            environment.put(name, funcExpr);
        }

        // Get the main expression
        CalcExpr mainExpr = this.visit(ctx.main());

        // Perform substitution on the main expression
        mainExpr = mainExpr.substitute(environment);

        return mainExpr;
    }

    @Override
    public CalcExpr visitMain(FunlParser.MainContext ctx) {
        Map<String, CalcExpr> environment = new HashMap<>();

        // Add where clauses to environment
        if (ctx.where() != null) {
            for (FunlParser.DeclsContext decl : ctx.where().decls()) {
                // Where declaration name
                String name = decl.IDENT().getText();
                // Where declaration expression
                CalcExpr whereExpr = this.visit(decl);
                // Add to local environment
                environment.put(name, whereExpr);
            }
        }

        // Get the main function expression
        CalcExpr expr = this.visit(ctx.expr());

        // Perform substitutions from the where
        expr.substitute(environment);

        return expr;
    }

    @Override
    public CalcExpr visitDecls(FunlParser.DeclsContext ctx) {
        CalcExpr expr = this.visit(ctx.expr());

        // List of args as strings, reversed
        List<String> args = new ArrayList<>(ctx.args().IDENT().stream().map(ParseTree::getText).toList());
        Collections.reverse(args);

        // Create the argument environment
        Map<String, CalcExpr> argEnv = new HashMap<>();

        // Replace arguments with lambda abstractions and replace variables with de Bruijn indices
        int index = 0;
        for (String arg : args) {
            // Should be replaced with de Bruijn index
            argEnv.put(arg, new IndexExpr(arg, index));
            index++;
        }

        // Replace args with indices in expression
        expr = expr.substitute(argEnv);

        // Wrap in abstractions
        for (String arg : args) {
            // Create lambda abstraction
            expr = new LambdaExpr(arg, expr);
        }

        // Replace where
        Map<String, CalcExpr> whereEnv = new HashMap<>();

        // Add where clauses to environment
        if (ctx.where() != null) {
            for (FunlParser.DeclsContext decl : ctx.where().decls()) {
                // Where declaration name
                String name = decl.IDENT().getText();
                // Where declaration expression
                CalcExpr whereExpr = this.visit(decl);

                // Replace parent function's args
                Map<String, CalcExpr> whereArgEnv = new HashMap<>();
                int whereArgIndex = decl.args().IDENT().size();
                for (String arg : args) {
                    whereArgEnv.put(arg, new IndexExpr(arg, whereArgIndex - 1));
                    whereArgIndex++;
                }
                whereExpr = whereExpr.substitute(whereArgEnv);

                // Add to local environment
                whereEnv.put(name, whereExpr);
            }
        }

        expr = expr.substitute(whereEnv);

        // De-recurse program
        CalcExpr.RemoveRecursiveCallsResult res = expr.removeRecursiveCalls(args.size(), ctx.IDENT().getText());
        expr = res.expr;
        if (res.anyRecursiveCalls) {
            expr = new ApplicationExpr(new IdentSub("Y"), new LambdaExpr("f", expr));
        }

        return expr;
    }

    @Override
    public CalcExpr visitApplicationExpr(FunlParser.ApplicationExprContext ctx) {
        // Get the arguments in the function application
        List<FunlParser.AexprContext> argExprs = ctx.aexpr();

        // Expression arguments
        CalcExpr expr = this.visit(argExprs.remove(0));

        // Create nested applications for each argument
        for (FunlParser.AexprContext argExpr : argExprs) {
            expr = new ApplicationExpr(expr, this.visit(argExpr));
        }

        return expr;
    }

    @Override
    public CalcExpr visitBinOpExpr(FunlParser.BinOpExprContext ctx) {
        CalcExpr lhs = this.visit(ctx.lhs);
        CalcExpr rhs = this.visit(ctx.rhs);
        String opStr = ctx.binop().getText();

        // Change infix ops to regular prefix prelude functions, or to primitive integer operations
        switch (opStr) {
            case "::" -> {
                return new ApplicationExpr(new ApplicationExpr(new IdentSub("cons"), lhs), rhs);
            }
            case "&&" -> {
                return new ApplicationExpr(new ApplicationExpr(new IdentSub("and"), lhs), rhs);
            }
            case "||" -> {
                return new ApplicationExpr(new ApplicationExpr(new IdentSub("or"), lhs), rhs);
            }
            default -> {
                return new IntOpExpr(OpType.fromString(opStr), lhs, rhs);
            }
        }
    }

    @Override
    public CalcExpr visitIfExpr(FunlParser.IfExprContext ctx) {
        CalcExpr predicate = this.visit(ctx.clause);
        CalcExpr thenExpr = this.visit(ctx.then_expr);
        CalcExpr elseExpr = this.visit(ctx.else_expr);

        // Convert to ifl prelude function
        return new ApplicationExpr(new ApplicationExpr(new ApplicationExpr(new IdentSub("ifl"), predicate), thenExpr), elseExpr);
    }

    @Override
    public CalcExpr visitNumExpr(FunlParser.NumExprContext ctx) {
        // Create constant expression
        return new ConstantExpr(Integer.parseInt(ctx.NUMERAL().getText()));
    }

    @Override
    public CalcExpr visitIdentExpr(FunlParser.IdentExprContext ctx) {
        return new IdentSub(ctx.IDENT().getText());
    }

    @Override
    public CalcExpr visitParenExpr(FunlParser.ParenExprContext ctx) {
        return this.visit(ctx.expr());
    }

    @Override
    public CalcExpr visitLambdaExpr(FunlParser.LambdaExprContext ctx) {
        String varName = ctx.IDENT().getText();
        CalcExpr expr = this.visit(ctx.expr());
        Map<String, CalcExpr> lambdaEnv = new HashMap<>();
        lambdaEnv.put(varName, new IndexExpr(varName, 0));

        // Substitute variable name with index
        expr = expr.substitute(lambdaEnv);

        return new LambdaExpr(ctx.IDENT().getText(), expr);
    }
}
