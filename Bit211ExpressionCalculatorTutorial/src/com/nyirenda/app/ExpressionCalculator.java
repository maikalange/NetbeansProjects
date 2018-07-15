/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nyirenda.app;

/**
 *
 * @author MARCUS
 */
public class ExpressionCalculator {

    public static double add(String expression) throws IllegalArgumentException {
        if (expression != null) {
            String[] operands = expression.split("\\+");
            return Double.valueOf(operands[1]) + Double.valueOf(operands[0]);
        }
        throw new IllegalArgumentException("Add expression is malformed.");
    }

}
