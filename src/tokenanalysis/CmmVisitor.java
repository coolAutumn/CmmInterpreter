// Generated from /Users/coolautumn/Documents/Compile_File/JAVA_IntelliJ/CmmInterpreter/resources/Cmm.g4 by ANTLR 4.5.3

    package tokenanalysis;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CmmParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CmmParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(CmmParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(CmmParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(CmmParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#varList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(CmmParser.VarListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(CmmParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(CmmParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#readStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStmt(CmmParser.ReadStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#writeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStmt(CmmParser.WriteStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#assignStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStmt(CmmParser.AssignStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#constants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstants(CmmParser.ConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#exprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(CmmParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CmmParser.ExprContext ctx);
}