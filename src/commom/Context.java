package commom;


import java.util.*;

/**
 * Created by LeeAutumn on 19/12/2016.
 * blog: leeautumn.net
 */
public class Context {

    /**
     * 所有的变量,name形式 : 作用域+"@"+变量名
     */
    public static Map<String,Identifier> values = new HashMap<>();

    //所处作用域
    //0 表示最外一层,每进一层则+1
    public static int indexOfScope = 0;


    //获得最近作用域的变量
    public static Identifier getIden(String idenname){
        int scope = Integer.valueOf(idenname.split("@")[0]);
        String realname = idenname.split("@")[1];

        Identifier temp = null;

        while ( (temp = values.get(scope + "@" +realname)) == null){
            scope --;
            if(scope < 0){
                break;
            }
        }

        return temp == null ? null : temp;
    }

    //用作在 varlist 中储存将要被声明的变量名
    public static List<String> varToBeIdentify = new ArrayList<>();
}


