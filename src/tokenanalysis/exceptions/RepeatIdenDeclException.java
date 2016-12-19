package tokenanalysis.exceptions;

import tokenanalysis.common.Context;

/**
 * Created by LeeAutumn on 19/12/2016.
 * blog: leeautumn.net
 */
public class RepeatIdenDeclException extends Exception {
    @Override
    public String toString() {
        return  "Repeat Identifier declaration is scope" + Context.indexOfScope
                +"\n"
                +super.toString();
    }
}
