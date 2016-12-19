package tokenanalysis.exceptions;

import tokenanalysis.common.Context;

/**
 * Created by LeeAutumn on 19/12/2016.
 * blog: leeautumn.net
 */
public class UndefinedVarException extends Exception {
    @Override
    public String toString() {
        return  "Undefined Identifier in scope " + Context.indexOfScope
                +"\n"
                +super.toString();
    }
}
