package tokenanalysis.common;

/**
 * Created by LeeAutumn on 19/12/2016.
 * blog: leeautumn.net
 */
public class Identifier{
    String name;
    Object value;
    IdenType type;

    public Identifier(String n,Object v,IdenType t){
        this.name = n;
        this.value = v;
        this.type = t;
    }
}
