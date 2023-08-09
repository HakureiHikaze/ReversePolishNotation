package wiki.gtnh.hikaze.Calculator;
import java.util.Map;
import java.util.regex.*;
import java.util.stream.Stream;

import wiki.gtnh.hikaze.Util.Exceptions.InvalidExpressionException;

public class Calculator {
    // /((([0-9]+\.[0-9]+)|([0-9]+))(e[0-9]+)?)|([a-zA-Z_][\w_]+(?=\())|([\(\)\+\_\\\/\*\%])/g
    private static final Pattern splitPattern = Pattern.compile(
            "((([0-9]+\\.[0-9]+)|([0-9]+))(e[0-9]+)?)|([a-zA-Z_][\\w_]+(?=\\())|([()+\\-\\\\/*%])");
    private Calculator(){}
    public static String[] SplitExpression(String expression) throws InvalidExpressionException {
        try{
            return splitPattern.matcher(expression).results().map(MatchResult::group).toArray(String[]::new);
        }catch (NullPointerException e){
            throw (new InvalidExpressionException(expression));
        }
    }
    public static String[] GenerateRPN(String[] legalExpressionArray){
        return null;
    }
    public static double calculate(String[] legalRPN){
        return 0f;
    }
}
