// Generated from /Users/coolautumn/Documents/Compile_File/JAVA_IntelliJ/CmmInterpreter/resources/Cmm.g4 by ANTLR 4.5.3

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link CmmVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class CmmBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements CmmVisitor<T> {
	CmmBaseListener cmmBaseListener = new CmmBaseListener();
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitProg(CmmParser.ProgContext ctx) {
		ctx.enterRule(cmmBaseListener);
		ctx.exitRule(cmmBaseListener);

		return visitChildren(ctx);
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStmt(CmmParser.StmtContext ctx) {
		ctx.enterRule(cmmBaseListener);
		ctx.exitRule(cmmBaseListener);

		return visitChildren(ctx);
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVarDecl(CmmParser.VarDeclContext ctx) {
		ctx.enterRule(cmmBaseListener);
		ctx.exitRule(cmmBaseListener);

		return visitChildren(ctx);
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVar(CmmParser.VarContext ctx) {
		ctx.enterRule(cmmBaseListener);
		ctx.exitRule(cmmBaseListener);

		return visitChildren(ctx);
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVarList(CmmParser.VarListContext ctx) {
		ctx.enterRule(cmmBaseListener);
		ctx.exitRule(cmmBaseListener);

		return visitChildren(ctx);
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIfStmt(CmmParser.IfStmtContext ctx) {
		ctx.enterRule(cmmBaseListener);
		ctx.exitRule(cmmBaseListener);

		return visitChildren(ctx);
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitWhileStmt(CmmParser.WhileStmtContext ctx) {
		ctx.enterRule(cmmBaseListener);
		ctx.exitRule(cmmBaseListener);

		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitReadStmt(CmmParser.ReadStmtContext ctx) {
		ctx.enterRule(cmmBaseListener);
		ctx.exitRule(cmmBaseListener);

		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitWriteStmt(CmmParser.WriteStmtContext ctx) {
		ctx.enterRule(cmmBaseListener);
		ctx.exitRule(cmmBaseListener);

		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAssignStmt(CmmParser.AssignStmtContext ctx) {
		ctx.enterRule(cmmBaseListener);
		ctx.exitRule(cmmBaseListener);

		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitConstants(CmmParser.ConstantsContext ctx) {
		ctx.enterRule(cmmBaseListener);
		ctx.exitRule(cmmBaseListener);

		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExprStmt(CmmParser.ExprStmtContext ctx) {

		System.out.println(ctx.getText());

		return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpr(CmmParser.ExprContext ctx) {
		ctx.enterRule(cmmBaseListener);
		ctx.exitRule(cmmBaseListener);

		return visitChildren(ctx);
	}
}