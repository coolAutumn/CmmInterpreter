// Generated from /Users/coolautumn/Documents/Compile_File/JAVA_IntelliJ/CmmInterpreter/resources/Cmm.g4 by ANTLR 4.5.3

import commom.CalculateExpression;
import commom.Context;
import commom.IdenType;
import commom.Identifier;
import exceptions.RepeatIdenDeclException;
import exceptions.UndefinedVarException;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.*;

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

		return visitChildren(ctx);
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStmt(CmmParser.StmtContext ctx) {

		return visitChildren(ctx);
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVarDecl(CmmParser.VarDeclContext ctx) {

		String type = ctx.Type().getSymbol().getText();								//变量声明,先获得声明的类型
		IdenType idenType = type.equals("int") ? IdenType.INTEGER : IdenType.FLOAT;

		//访问 varlist ,得到
		visitVarList(ctx.varList());

		for(String s : Context.varToBeIdentify){
			//把数组改为真名
			String realname = null;
			if(s.indexOf("[") >= 0){
				realname = s.substring(0,s.indexOf("[")+1);
			}else{
				realname = s;
			}


			//先判断是否重复声明了
			try {
				if(Context.values.containsKey(Context.indexOfScope+"@"+realname)){
					throw  new RepeatIdenDeclException();
				}
			}catch (RepeatIdenDeclException e){
				System.err.println("Declaration "+s+" :"+e);
				System.exit(-1);
			}

			//判断是数组还是什么
			if(s.indexOf("[") >= 0){
				int size = Integer.valueOf(s.substring(s.indexOf("[")+1,s.indexOf("]")));
				List<Double> list = new ArrayList<Double>(Integer.valueOf(size));
				//初始化数组
				for(int i=0;i<size;i++){
					list.add(0.0);
				}

				//数组名字存储形式为 --  name[
				Context.values.put(Context.indexOfScope+"@"+realname, new Identifier(Context.indexOfScope+"@"+realname,list,idenType.equals(IdenType.INTEGER) ? IdenType.IARRAY:IdenType.FARRAY,Integer.valueOf(size)));
			}else{
				Context.values.put(Context.indexOfScope+"@"+realname, new Identifier(Context.indexOfScope+"@"+realname,Double.valueOf("0"),idenType,0));
			}
		}



		//在结束了变量声明之后,清除用于暂时保存变量名的arraylist
//		System.out.println(Context.values.entrySet());
//		Context.varToBeIdentify.clear();

		return visitChildren(ctx);
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVar(CmmParser.VarContext ctx) {

		return visitChildren(ctx);
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitVarList(CmmParser.VarListContext ctx) {
		Context.varToBeIdentify.clear();
		//根据var list
		String[] idens = ctx.getText().split(",");
		for( String s : idens){
			Context.varToBeIdentify.add(s);
		}

		return visitChildren(ctx);
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitIfStmt(CmmParser.IfStmtContext ctx) {
		String s = ctx.getText();
		String text = ctx.exprStmt().getText();
		String prog = ctx.prog(0).getText();
		if (ctx.prog(1) != null) {
			//说明有else
			if (getBoolState(text)) {
				System.out.println("作用域切换至" + (++Context.indexOfScope));
				visitProg(ctx.prog(0));
				//当退出if时,还原作用域
				deleteIdenInCurrentScope();
				System.out.println("作用域切换至" + (--Context.indexOfScope));
				return null;
			} else {
				System.out.println("作用域切换至" + (++Context.indexOfScope));
				visitProg(ctx.prog(1));
				//当退出if时,还原作用域
				deleteIdenInCurrentScope();
				System.out.println("作用域切换至" + (--Context.indexOfScope));
			}
		} else {
			//只有一项
			if (getBoolState(text)) {
				System.out.println("作用域切换至" + (++Context.indexOfScope));
				visitProg(ctx.prog(0));
				//当退出if时,还原作用域
				deleteIdenInCurrentScope();
				System.out.println("作用域切换至" + (--Context.indexOfScope));
			}

		}
		return null;
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitWhileStmt(CmmParser.WhileStmtContext ctx) {

		String s = ctx.getText();
		String text = ctx.exprStmt().getText();
		String prog = ctx.prog().getText();
//		System.out.println("##################");
//		System.out.println(s);
//		System.out.println(text);
//		System.out.println(prog);
//		System.out.println("##################");
		//visitExprStmt(ctx.exprStmt());
		while (getBoolState(text)) {
			System.out.println("作用域切换至" + (++Context.indexOfScope));

			visitProg(ctx.prog());

			//当退出while时,还原作用域
			deleteIdenInCurrentScope();
			System.out.println("作用域切换至" + (--Context.indexOfScope));
		}

		return null;
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitReadStmt(CmmParser.ReadStmtContext ctx) {
		//准备读取
		String idenname = ctx.var().getText();
		String realname =null;

		if(idenname.indexOf("[") >= 0){
			realname = idenname.substring(0,idenname.indexOf("[")+1);
		}else{
			realname = idenname;
		}

		if(Context.getIden(Context.indexOfScope+"@"+realname) != null){
			Scanner scanner = new Scanner(System.in);
			String v = scanner.nextLine();

			//得到储存好的变量
			Identifier identifier = Context.getIden(Context.indexOfScope+"@"+realname);
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

		return visitChildren(ctx);
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitWriteStmt(CmmParser.WriteStmtContext ctx) {
		//向console输出
		System.out.print("Begin to write: ");
		String idenname = ctx.var().getText();
		String realname = null;

		if(idenname.indexOf("[") >= 0){
			realname = idenname.substring(0,idenname.indexOf("[")+1);
		}else{
			realname = idenname;
		}

		//得到储存好的变量
		Identifier identifier = Context.getIden(Context.indexOfScope+"@"+realname);

		if(identifier != null){

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

		return visitChildren(ctx);
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitAssignStmt(CmmParser.AssignStmtContext ctx) {
		String idenname = ctx.var().getText();
		String realname =null;
		String expr = ctx.exprStmt().getText();

		if(idenname.indexOf("[") >= 0){
			realname = idenname.substring(0,idenname.indexOf("[")+1);
		}else{
			realname = idenname;
		}

		//得到储存好的变量
		Identifier identifier = Context.getIden(Context.indexOfScope+"@"+realname);


		if(identifier != null){

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


		return visitChildren(ctx);
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExprStmt(CmmParser.ExprStmtContext ctx) {


		return visitChildren(ctx);
	}


	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitExpr(CmmParser.ExprContext ctx) {

		return visitChildren(ctx);
	}


	//用来在声明变量时使用
	public void deleteIdenInCurrentScope(){
		int scope = Context.indexOfScope;

		for(Map.Entry<String,Identifier> entry : Context.values.entrySet()){
			if(entry.getKey().indexOf(String.valueOf(Context.indexOfScope)) >= 0 ){
				Context.values.remove(entry.getKey());
			}
		}
	}

	//数组越界检查
	public void rangeCheck(Identifier identifier, int index){
		if(index > identifier.size){
			try{
				throw new ArrayIndexOutOfBoundsException();
			}catch (ArrayIndexOutOfBoundsException e){
				System.err.println(e);
				System.err.println(index + " is out of range of Array "+identifier.name);
			}
		}
	}

	/**
	 * 根据传进来的式子 来测试正误
	 *
	 * @param state
	 * @return
	 */
	public boolean getBoolState(String state) {
//		System.out.println("#######################");
//		System.out.println(state);
//		System.out.println("#######################");
		String number_left;
		String number_right;
		//等号 == != <= >= > <
		//首先去掉语句中所有的空格
		state = state.replaceAll(" ", "");
		if (state.contains("==")) {
			// 说明是 ==
			number_left = state.substring(0, state.indexOf("=="));
			number_right = state.substring(state.indexOf("==") + 2);
			Double resultLeft = CalculateExpression.calexpression(number_left);
			Double resultright = CalculateExpression.calexpression(number_right);
//			System.out.println("left : " + resultLeft);
//			System.out.println("right : " + resultright);
//			System.out.println(resultLeft == resultright);
			return resultLeft.equals(resultright);
//			System.out.println(number_left + "==" + number_right);
		}
		if (state.contains("!=")) {
			// 说明是 !=
			number_left = state.substring(0, state.indexOf("!="));
			number_right = state.substring(state.indexOf("!=") + 2);
			Double resultLeft = CalculateExpression.calexpression(number_left);
			Double resultright = CalculateExpression.calexpression(number_right);
//			System.out.println("left : " + resultLeft);
//			System.out.println("right : " + resultright);
//			System.out.println(resultLeft != resultright);
			return !resultLeft.equals(resultright);
//			System.out.println(number_left + "==" + number_right);
		}
		if (state.contains(">=")) {
			// 说明是 >=
			number_left = state.substring(0, state.indexOf(">="));
			number_right = state.substring(state.indexOf(">=") + 2);
			Double resultLeft = CalculateExpression.calexpression(number_left);
			Double resultright = CalculateExpression.calexpression(number_right);
			return resultLeft >= resultright;
//			System.out.println(number_left + "==" + number_right);
		}
		if (state.contains("<=")) {
			// 说明是 <=
			number_left = state.substring(0, state.indexOf("<="));
			number_right = state.substring(state.indexOf("<=") + 2);
			Double resultLeft = CalculateExpression.calexpression(number_left);
			Double resultright = CalculateExpression.calexpression(number_right);
			return resultLeft <= resultright;
//			System.out.println(number_left + "==" + number_right);
		}
		if (state.contains(">")) {
			// 说明是 >
			number_left = state.substring(0, state.indexOf(">"));
			number_right = state.substring(state.indexOf(">") + 1);
			Double resultLeft = CalculateExpression.calexpression(number_left);
			Double resultright = CalculateExpression.calexpression(number_right);
			return resultLeft > resultright;
//			System.out.println(number_left + "==" + number_right);
		}
		if (state.contains("<")) {
			// 说明是 <
			number_left = state.substring(0, state.indexOf("<"));
			number_right = state.substring(state.indexOf("<") + 1);
//			System.out.println("chushi : " + number_left);
//			System.out.println("chushi : " + number_right);
			Double resultLeft = CalculateExpression.calexpression(number_left);
			Double resultright = CalculateExpression.calexpression(number_right);
//			System.out.println("结果 :" + resultLeft);
//			System.out.println("结果 :" + resultright);
			return resultLeft < resultright;
//			System.out.println(number_left + "==" + number_right);
		}
		if (state.equals("true")) {
			return true;
		}
		if (state.equals("false")) {
			return false;
		}
		System.err.println(state + "有误! ,情监测");
		return false;
	}
}