/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nyirenda.app;

import java.math.BigDecimal;
import java.util.Stack;

/**
 *
 * @author MARCUS
 */
public class Bit211ExpressionCalculatorTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Stack expression  = new Stack();
        expression.add(12);
        expression.add('+');
        expression.add(13);
        
        Object[] tokens  = expression.toArray();
        
        if (expression.peek().equals('+')) {
            System.out.println("Found an operator");
        }
        
        
        String exp  = expression.toString();
        
        System.out.println(exp);
        
        BigDecimal a = new BigDecimal(100);
        BigDecimal b = new BigDecimal(50);
        b.compareTo(a);

        boolean isValid = isValidExpression("12--9", '-');
        System.out.println(isValid);

        String sb = "12+20";

        int operatorPosition = sb.lastIndexOf("+");
        int lengthOfExpression = sb.length();

        String numberAfterOperator = sb.substring(operatorPosition + 1, lengthOfExpression);

        System.out.println(numberAfterOperator);

        appendOperand("12334-", "-","345");
    }

    private static void appendOperand(String expression, String operator, String operand) {
        //input 12+
        //output 12+9
       

        StringBuilder input = new StringBuilder(expression);
        int operatorPosition = input.indexOf(operator);
        int expressionLength = input.length();
        String fullExpression;
        final boolean operatorIsLastCharacter = expressionLength - 1 == operatorPosition;

        //append operand
        if (operatorPosition > -1 && operatorIsLastCharacter) {
            fullExpression = input.append(operand).toString();

        } else {
            //No operator was found append new operator
            fullExpression = expression;
        }
        System.out.println(fullExpression);
    }

    private static String buildExpression() {

        return "";
    }

    private static boolean isValidExpression(String expression, char operator) {
        //1. expression must contain 2 operands
        //2. expression must contain at most 1 operator
        int numberOfOperands = 0;
        boolean validExpression;
        if (expression != null) {
            String[] operands = expression.split("\\" + operator);
            numberOfOperands = operands.length;
        }

        return (numberOfOperands == 2);
    }

}
