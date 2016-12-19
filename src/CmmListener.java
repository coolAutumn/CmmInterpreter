// Generated from /Users/coolautumn/Documents/Compile_File/JAVA_IntelliJ/CmmInterpreter/resources/Cmm.g4 by ANTLR 4.5.3

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CmmParser}.
 */
public interface CmmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CmmParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CmmParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CmmParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(CmmParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(CmmParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(CmmParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(CmmParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(CmmParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(CmmParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#varList}.
	 * @param ctx the parse tree
	 */
	void enterVarList(CmmParser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#varList}.
	 * @param ctx the parse tree
	 */
	void exitVarList(CmmParser.VarListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(CmmParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(CmmParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(CmmParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(CmmParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#readStmt}.
	 * @param ctx the parse tree
	 */
	void enterReadStmt(CmmParser.ReadStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#readStmt}.
	 * @param ctx the parse tree
	 */
	void exitReadStmt(CmmParser.ReadStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void enterWriteStmt(CmmParser.WriteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void exitWriteStmt(CmmParser.WriteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(CmmParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(CmmParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#constants}.
	 * @param ctx the parse tree
	 */
	void enterConstants(CmmParser.ConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#constants}.
	 * @param ctx the parse tree
	 */
	void exitConstants(CmmParser.ConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(CmmParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(CmmParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CmmParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CmmParser.ExprContext ctx);
}