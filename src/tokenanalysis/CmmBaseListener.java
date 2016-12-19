// Generated from /Users/coolautumn/Documents/Compile_File/JAVA_IntelliJ/CmmInterpreter/resources/Cmm.g4 by ANTLR 4.5.3

    package tokenanalysis;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import tokenanalysis.common.Context;
import tokenanalysis.common.IdenType;
import tokenanalysis.common.Identifier;

import java.util.ArrayList;
import java.util.Map;

/**
 * This class provides an empty implementation of {@link CmmListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class CmmBaseListener implements CmmListener {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterProg(CmmParser.ProgContext ctx) {

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProg(CmmParser.ProgContext ctx) {
		System.out.println("Program exit!");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStmt(CmmParser.StmtContext ctx) {
		//不用干什么,因为stmt都被分好类了
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStmt(CmmParser.StmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVarDecl(CmmParser.VarDeclContext ctx) {
		String type = ctx.Type().getSymbol().getText();								//变量声明,先获得声明的类型
		IdenType idenType = type.equals("int") ? IdenType.INTEGER : IdenType.FLOAT;

		for(String s : Context.varToBeIdentify){
			//判断是数组还是什么
			if(s.indexOf("[") >= 0){
				String index = s.substring(s.indexOf("[")+1,s.indexOf("]"));

				Context.values.put(Context.indexOfScope+"@"+s, new Identifier(Context.indexOfScope+"@"+s,new ArrayList<Double>(Integer.valueOf(index)),idenType.equals(IdenType.INTEGER) ? IdenType.IARRAY:IdenType.FARRAY));
			}else{
				Context.values.put(Context.indexOfScope+"@"+s, new Identifier(Context.indexOfScope+"@"+s,Double.valueOf("0"),idenType));
			}
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVarDecl(CmmParser.VarDeclContext ctx) {
		//清除list
		Context.varToBeIdentify.clear();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVar(CmmParser.VarContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVar(CmmParser.VarContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVarList(CmmParser.VarListContext ctx) {
		String[] idens = ctx.getText().split(",");
		for( String s : idens){
			Context.varToBeIdentify.add(s);
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVarList(CmmParser.VarListContext ctx) {
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIfStmt(CmmParser.IfStmtContext ctx) {
		System.out.println("作用域切换至"+ (++Context.indexOfScope));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIfStmt(CmmParser.IfStmtContext ctx) {
		//删除当前作用域的字符
		deleteIdenInCurrentScope();

		System.out.println("作用域切换至"+ (--Context.indexOfScope));


	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWhileStmt(CmmParser.WhileStmtContext ctx) {
		System.out.println("作用域切换至"+ (++Context.indexOfScope));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWhileStmt(CmmParser.WhileStmtContext ctx) {
		//删除当前作用域的字符
		deleteIdenInCurrentScope();

		System.out.println("作用域切换至"+ (--Context.indexOfScope));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterReadStmt(CmmParser.ReadStmtContext ctx) {

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitReadStmt(CmmParser.ReadStmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWriteStmt(CmmParser.WriteStmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWriteStmt(CmmParser.WriteStmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignStmt(CmmParser.AssignStmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignStmt(CmmParser.AssignStmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterConstants(CmmParser.ConstantsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConstants(CmmParser.ConstantsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExprStmt(CmmParser.ExprStmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExprStmt(CmmParser.ExprStmtContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpr(CmmParser.ExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpr(CmmParser.ExprContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }

	public void deleteIdenInCurrentScope(){
		int scope = Context.indexOfScope;

		for(Map.Entry<String,Identifier> entry : Context.values.entrySet()){
			if(entry.getKey().charAt(0) == (char)Context.indexOfScope){
				Context.values.remove(entry.getKey());
			}
		}
	}
}