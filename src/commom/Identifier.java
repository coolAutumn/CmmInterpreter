package commom;

/**
 * Created by LeeAutumn on 19/12/2016.
 * blog: leeautumn.net
 */
public class Identifier{
    public String name;
    public Object value;
    public IdenType type;
    public int size;

    public Identifier(String n,Object v,IdenType t,int s){
        this.name = n;
        this.value = v;
        this.type = t;
        this.size = s;
    }


}
