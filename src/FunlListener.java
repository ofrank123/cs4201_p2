// Generated from Funl.g by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunlParser}.
 */
public interface FunlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FunlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FunlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunlParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(FunlParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunlParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(FunlParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunlParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(FunlParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunlParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(FunlParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunlParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(FunlParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunlParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(FunlParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunlParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(FunlParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunlParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(FunlParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LeftExpr}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLeftExpr(FunlParser.LeftExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LeftExpr}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLeftExpr(FunlParser.LeftExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinOpExpr}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinOpExpr(FunlParser.BinOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinOpExpr}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinOpExpr(FunlParser.BinOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusExpr}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(FunlParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusExpr}
	 * labeled alternative in {@link FunlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(FunlParser.MinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LambdaExpr}
	 * labeled alternative in {@link FunlParser#lexpr}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpr(FunlParser.LambdaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LambdaExpr}
	 * labeled alternative in {@link FunlParser#lexpr}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpr(FunlParser.LambdaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link FunlParser#lexpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(FunlParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link FunlParser#lexpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(FunlParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ApplicationExpr}
	 * labeled alternative in {@link FunlParser#lexpr}.
	 * @param ctx the parse tree
	 */
	void enterApplicationExpr(FunlParser.ApplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ApplicationExpr}
	 * labeled alternative in {@link FunlParser#lexpr}.
	 * @param ctx the parse tree
	 */
	void exitApplicationExpr(FunlParser.ApplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link FunlParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(FunlParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link FunlParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(FunlParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentExpr}
	 * labeled alternative in {@link FunlParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterIdentExpr(FunlParser.IdentExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentExpr}
	 * labeled alternative in {@link FunlParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitIdentExpr(FunlParser.IdentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumExpr}
	 * labeled alternative in {@link FunlParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(FunlParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumExpr}
	 * labeled alternative in {@link FunlParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(FunlParser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunlParser#binop}.
	 * @param ctx the parse tree
	 */
	void enterBinop(FunlParser.BinopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunlParser#binop}.
	 * @param ctx the parse tree
	 */
	void exitBinop(FunlParser.BinopContext ctx);
}