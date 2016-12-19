// Generated from /Users/coolautumn/Documents/Compile_File/JAVA_IntelliJ/CmmInterpreter/resources/Cmm.g4 by ANTLR 4.5.3

    package tokenanalysis;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.omg.PortableInterceptor.INACTIVE;
import tokenanalysis.common.CalculateExpression;
import tokenanalysis.common.Context;
import tokenanalysis.common.IdenType;
import tokenanalysis.common.Identifier;
import tokenanalysis.exceptions.RepeatIdenDeclException;
import tokenanalysis.exceptions.UndefinedVarException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

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
//		System.out.println("Program exit!");
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

			//先判断是否重复声明了
			try {
				if(Context.values.containsKey(Context.indexOfScope+"@"+s)){
					throw  new RepeatIdenDeclException();
				}
			}catch (RepeatIdenDeclException e){
				System.err.println("Declaration "+s+" :"+e);
				System.exit(-1);
			}

			//判断是数组还是什么
			if(s.indexOf("[") >= 0){
				String size = s.substring(s.indexOf("[")+1,s.indexOf("]"));

				//数组名字存储形式为 --  name[12
				Context.values.put(Context.indexOfScope+"@"+s, new Identifier(Context.indexOfScope+"@"+s.substring(0,s.indexOf("[")+1),new ArrayList<Double>(Integer.valueOf(size)),idenType.equals(IdenType.INTEGER) ? IdenType.IARRAY:IdenType.FARRAY));
			}else{
				Context.values.put(Context.indexOfScope+"@"+s, new Identifier(Context.indexOfScope+"@"+s,Double.valueOf("0"),idenType));
			}
		}

	}		//--over
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVarDecl(CmmParser.VarDeclContext ctx) {
		//清除list
		Context.varToBeIdentify.clear();
	}		//--over
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVar(CmmParser.VarContext ctx) { }				//--over
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVar(CmmParser.VarContext ctx) { }					//--over
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
	}		//--over
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVarList(CmmParser.VarListContext ctx) {}			//--over
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
		String idenname = ctx.var().getText();
		String realname =null;

		if(idenname.indexOf("[") >= 0){
			realname = idenname.substring(0,idenname.indexOf("[")+1);
		}else{
			realname = idenname;
		}

		if(Context.values.containsKey(Context.indexOfScope+"@"+realname)){
			Scanner scanner = new Scanner(System.in);
			String v = scanner.nextLine();

			//得到储存好的变量
			Identifier identifier = Context.values.get(Context.indexOfScope+"@"+realname);
			double value = identifier.type.equals(IdenType.INTEGER) || identifier.type.equals(IdenType.IARRAY) ? Integer.valueOf(v) : Double.valueOf(v);

			//根据是否是数组来进行赋值
			if(identifier.type.equals(IdenType.FARRAY) || identifier.type.equals(IdenType.IARRAY)){
				String index = idenname.substring(idenname.indexOf("[")+1,idenname.indexOf("]"));

				rangeCheck(identifier,Integer.valueOf(index));

				((List<Double>)identifier.value).set(Integer.valueOf(index),value);
			}else{
				identifier.value = value;
			}

		}else{
			try{
				throw new UndefinedVarException();
			}catch (UndefinedVarException e){
				System.out.println(idenname+":"+e);
				System.exit(-1);
			}
		}
	}	//--over
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
	@Override public void enterWriteStmt(CmmParser.WriteStmtContext ctx) {
		String idenname = ctx.var().getText();
		String realname = null;

		if(idenname.indexOf("[") >= 0){
			realname = idenname.substring(0,idenname.indexOf("[")+1);
		}else{
			realname = idenname;
		}

		if(Context.values.containsKey(Context.indexOfScope+"@"+realname)){
			//得到储存好的变量
			Identifier identifier = Context.values.get(Context.indexOfScope+"@"+realname);

			//根据是否是数组来进行赋值
			if(identifier.type.equals(IdenType.FARRAY)){
				String index = idenname.substring(idenname.indexOf("[")+1,idenname.indexOf("]"));

				rangeCheck(identifier,Integer.valueOf(index));
				System.out.println( ((List<Double>)identifier.value).get(Integer.valueOf(index)));
			}else if(identifier.type.equals(IdenType.IARRAY)){
				String index = idenname.substring(idenname.indexOf("[")+1,idenname.indexOf("]"));

				rangeCheck(identifier,Integer.valueOf(index));
				System.out.println((int)(double)((List<Double>)identifier.value).get(Integer.valueOf(index)));
			}else if(identifier.type.equals(IdenType.INTEGER)){

				System.out.println((int)(double) identifier.value);
			}else {
				System.out.println(identifier.value);
			}

		}else{
			try{
				throw new UndefinedVarException();
			}catch (UndefinedVarException e){
				System.out.println(idenname+":"+e);
				System.exit(-1);
			}
		}
	}	//--over
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
	@Override public void enterAssignStmt(CmmParser.AssignStmtContext ctx) {
		String idenname = ctx.var().getText();
		String realname =null;
		String expr = ctx.exprStmt().getText();

		if(idenname.indexOf("[") >= 0){
			realname = idenname.substring(0,idenname.indexOf("[")+1);
		}else{
			realname = idenname;
		}

		if(Context.values.containsKey(Context.indexOfScope+"@"+realname)){

			//得到储存好的变量
			Identifier identifier = Context.values.get(Context.indexOfScope+"@"+realname);
			double v = CalculateExpression.calexpression(expr);
			double value = identifier.type.equals(IdenType.INTEGER) || identifier.type.equals(IdenType.IARRAY) ? (int)v : v;

			//根据是否是数组来进行赋值
			if(identifier.type.equals(IdenType.FARRAY) || identifier.type.equals(IdenType.IARRAY)){
				String index = idenname.substring(idenname.indexOf("[")+1,idenname.indexOf("]"));

				rangeCheck(identifier, Integer.valueOf(index));
				((List<Double>)identifier.value).set(Integer.valueOf(index),value);
			}else{
				identifier.value = value;
			}

		}else{
			try{
				throw new UndefinedVarException();
			}catch (UndefinedVarException e){
				System.out.println(idenname+":"+e);
				System.exit(-1);
			}
		}
	} //--over
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
	@Override public void enterConstants(CmmParser.ConstantsContext ctx) { }     //--应该不用管
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitConstants(CmmParser.ConstantsContext ctx) { }		//--应该不用管
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExprStmt(CmmParser.ExprStmtContext ctx) { }		//--应该不用管
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExprStmt(CmmParser.ExprStmtContext ctx) { }		//--应该不用管
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpr(CmmParser.ExprContext ctx) { }				//--应该不用管
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpr(CmmParser.ExprContext ctx) { }				//--应该不用管

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) { }				//--应该不用管
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }				//--应该不用管
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }					//--应该不用管
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }					//--应该不用管

	//用来在声明变量时使用
	public void deleteIdenInCurrentScope(){
		int scope = Context.indexOfScope;

		for(Map.Entry<String,Identifier> entry : Context.values.entrySet()){
			if(entry.getKey().charAt(0) == (char)Context.indexOfScope){
				Context.values.remove(entry.getKey());
			}
		}
	}

	//数组越界检查
	public void rangeCheck(Identifier identifier, int index){
		if(index > ((List<Double>)identifier.value).size()){
			try{
				throw new ArrayIndexOutOfBoundsException();
			}catch (ArrayIndexOutOfBoundsException e){
				System.err.println(e);
				System.err.println(index + " is out of range of Array "+identifier.name);
			}
		}
	}
}