package wiki.gtnh.hikaze;

import wiki.gtnh.hikaze.Calculator.Calculator;
import wiki.gtnh.hikaze.Operators.Operators;
import wiki.gtnh.hikaze.Operators.OptType;
import wiki.gtnh.hikaze.Operators.UnitType;
import wiki.gtnh.hikaze.Util.Exceptions.InvalidExpressionException;

import java.io.Console;
import java.util.ConcurrentModificationException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        new Operators(OptType.Prefix,"test", 16, in ->in[0]+5, UnitType.FUNCTION);
        new Operators(OptType.Prefix,"test1_", 16, in ->in[0]+5, UnitType.FUNCTION);
        new Operators(OptType.Generic, "(", 16, in -> in[0], UnitType.OPERATOR);
        new Operators(OptType.Generic, ")", 16, in -> in[0], UnitType.OPERATOR);
        new Operators(OptType.Generic, "+", 16, in -> in[0] + in[1], UnitType.OPERATOR);
        new Operators(OptType.Generic, "+", 16, in -> in[0] * in[1], UnitType.OPERATOR);
        while(true){
            String input = inp.nextLine();
            if(input.equals("quit")){
                break;
            }
            try{
                String[] test = Calculator.SplitExpression(input);
                Calculator.GenerateRPN(test);
            }catch(InvalidExpressionException e){
                e.printStackTrace();
                System.out.println(e.errExpression);
            }
        }
    }
}