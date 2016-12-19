package tokenanalysis.common;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by LeeAutumn on 19/12/2016.
 * blog: leeautumn.net
 */
public class CalculateExpression {

    /**
     * 需要正确的中缀表达式,而不是比较式
     * @param expressionStmt
     * @return
     */
    public static Double calexpression(String expressionStmt){
        String[] strs = InfixToSuffix.transer(expressionStmt);

        Stack<Double> stack = new Stack<>();

        for(int i = 0;i<strs.length;i++){
            if(isOperator(strs[i]) == 0){           //如果是数字,则向栈中添加
                if(isIdentifier(strs[i])) {                              //如果是变量标识符
                    Identifier identifier = Context.getIden(Context.indexOfScope + "@" +strs[i].split("\\]")[0]);           //作用域+"@"+变量名 来获得变量
                    if(identifier != null){
                        //如果是数组
                        if(identifier.name.indexOf("[") >= 0){
                            //获得数组位置
                            String index = identifier.name.substring(identifier.name.indexOf("[")+1,identifier.name.indexOf("]"));
                            Object value = identifier.value;

                            stack.push(((List<Double>)value).get(Integer.valueOf(index)));
                        }else {
                            stack.push((Double)identifier.value);
                        }
                    }else{
                        System.out.println("ERROR: Identifier named "+strs[i]+"haven't been initilized");
                        System.exit(0);
                    }
                }else{                              //是数字直接向栈中添加
                    stack.push(Double.valueOf(strs[i]));
                }
            }else{                                  //如果不是则取出数字计算
                Double d1 = stack.pop();
                Double d2 = stack.pop();

                stack.push(cal(d1,d2,strs[i].charAt(0)));
            }
        }

        return stack.pop();
    }

    /**
     * inspect the char is the operator & return the priority of the operator
     * @param c
     * @return 0    isNumber
     *         !0   the priority of the operator
     */
    private static int isOperator(String c){
        if(c.length() == 1 && c.charAt(0) >= 40 && c.charAt(0) <= 47 ){
            return 1;
        }
        return 0;
    }

    private static boolean isIdentifier(String iden){
        char[] chars = iden.toCharArray();

        int i=0;
        for(;i < chars.length;i++){
            if(!Character.isDigit(chars[i]) && chars[i] != '.'){
                break;
            }
        }

        return i == chars.length-1;
    }

    private static Double cal(Double d1,Double d2,char op){
        switch (op){
            case '+':
                return d2 + d1;

            case '-':
                return d2 - d1;

            case '*':
                return d2 * d1;

            case '/':
                return d2 / d1;

            default:
                return 0.0;
        }
    }
}
