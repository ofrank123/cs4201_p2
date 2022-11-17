// Generated from Funl.g by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FunlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FunlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FunlParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FunlParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunlParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(FunlParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunlParser#decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecls(FunlParser.DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunlParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(FunlParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunlParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(FunlParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LeftExpr}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftExpr(FunlParser.LeftExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinOpExpr}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpExpr(FunlParser.BinOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusExpr}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpr(FunlParser.MinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LambdaExpr}
	 * labeled alternative in {@link FunlParser#lexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpr(FunlParser.LambdaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link FunlParser#lexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(FunlParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ApplicationExpr}
	 * labeled alternative in {@link FunlParser#lexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplicationExpr(FunlParser.ApplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link FunlParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(FunlParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentExpr}
	 * labeled alternative in {@link FunlParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentExpr(FunlParser.IdentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumExpr}
	 * labeled alternative in {@link FunlParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpr(FunlParser.NumExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunlParser#binop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinop(FunlParser.BinopContext ctx);
}