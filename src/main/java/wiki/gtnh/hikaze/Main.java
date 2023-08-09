package wiki.gtnh.hikaze;

import wiki.gtnh.hikaze.Calculator.Calculator;
import wiki.gtnh.hikaze.Operators.Operators;
import wiki.gtnh.hikaze.Operators.OptType;
import wiki.gtnh.hikaze.Util.Exceptions.InvalidExpressionException;

import java.io.Console;
import java.util.ConcurrentModificationException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            String input = in.nextLine();
            if(input.equals("quit")){
                break;
            }
            try{
                String[] test = Calculator.SplitExpression(input);
                for (String str:test) {
                    System.out.println(str);
                }
            }catch(InvalidExpressionException e){
                e.printStackTrace();
                System.out.println(e.errExpression);
            }
        }
    }
}