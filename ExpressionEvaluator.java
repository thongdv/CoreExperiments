/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sivateja.p
 */
public class ExpressionEvaluator {

    static List<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        try {
            Scanner console = new Scanner(System.in);
            System.out.println("This program evaluates prefix expressions");
            System.out.println("for operators +, -, *, / and %");
            System.out.print("plese enter the expression");
            String str = console.nextLine();
            //String str = "(+ 3 (* 5 2) (- 6 3))";
            String str_cpy = str;
            list.add(String.valueOf(str_cpy.charAt(1)));
            parseTheExpresssion(str, str_cpy);
        } catch (Exception e) {
            System.out.println("\n ******* error *********");
            System.out.println(e.getMessage());
            System.out.println("please provide valid format. ex: (- 7 3 ),(-2 (* 3 2) 2)");
        }
    }

    private static void parseTheExpresssion(String str, String originalString) {

        int openBraceindex = str.lastIndexOf("(");
        int closingBraceIndex = 0;
        for (int i = openBraceindex; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                closingBraceIndex = i;
                i = str.length();
            }
        }
        //finding and open and closing braces and make a sub expression.
        String subExpression = str.substring(openBraceindex, closingBraceIndex + 1);
        System.out.println("sub expression is " + subExpression);
        Integer value = evaluateExpression(subExpression);
        if(value >0){
        list.add(String.valueOf(value));
        }
        //after evaluating the subexpression we will replace that expression.
        str = str.replace(subExpression, "");
        // System.out.println("main expression is " + str);
        //if there is nothing in the main expression we will evaluate the final set of values
        if (str.equals("")) {
            if (list.size() > 1 && Integer.parseInt(list.get(1)) >0 ) {
                String expression = Arrays.toString(list.toArray());
                int finalValue = evaluateExpression(expression);
                System.out.println("result of the given expression " + originalString + " is   " + finalValue);
            } else{
                
                System.out.println("result of the given expression is " + 0);
            }
        } else {
            parseTheExpresssion(str, originalString);

        }

    }

    // this method takes the sub expressions and evaluates them
    private static int evaluateExpression(String subStrt) {
        System.out.println("evaluating " + subStrt);
        int localVal = 1;
        for (int i = 0; i < subStrt.length(); i++) {
            if (i == 0) {
                if (subStrt.charAt(1) == '*') {
                    localVal = 1;
                } else  {
                    localVal = 0;
                }
            }
            if (!Character.isDigit(subStrt.charAt(i))) {
                continue;
            } else {
                localVal = performOperation(subStrt.charAt(1), localVal, getTheOperand(subStrt, i));
            }

        }
        System.out.println("the value of the exp" + subStrt + "is " + localVal + "\n");

        return localVal;
    }

    // this will return the numbers that are read form the expressions
    public static int getTheOperand(String subStrt, int i) {
        StringBuffer sbuf = new StringBuffer();
        while (i < subStrt.length() && subStrt.charAt(i) >= '0' && subStrt.charAt(i) <= '9') {
            sbuf.append(subStrt.charAt(i++));
        }
        return Integer.parseInt(sbuf.toString());
    }

    // this will perform different arethimatic operations
    public static int performOperation(char op, int prevValue, int nextValue) {
        switch (op) {
            case '+':
                return prevValue + nextValue;
            case '-':
                int result = 0;
                if (prevValue == 0) {
                    result = nextValue - prevValue;
                } else {
                    result = prevValue - nextValue;
                }
                return result;
            case '*':
                return prevValue * nextValue;
            case '/':
                if (nextValue == 0) {
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
                if (prevValue == 0) {
                    prevValue =1;
                    return  nextValue/prevValue;
                } else {
                    return  prevValue / nextValue;
                }
                
        }
        return 0;
    }
}
