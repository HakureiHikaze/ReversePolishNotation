package wiki.gtnh.hikaze.Util.Exceptions;

public class InvalidExpressionException extends Exception{
    public final String errExpression;
    public InvalidExpressionException(String errExpression_){
        errExpression = errExpression_;
    }
}

