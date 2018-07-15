/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211scannertutorial;

import java.util.Scanner;

/**
 *
 * @author MARCUS
 */
public class BIT211ScannerTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double result = evaluateExpression("12/10.05", "/");
        System.out.println(result);
    }

    private static double evaluateExpression(String expression, String delimiter) {

        try (Scanner sc = new Scanner(expression)) {
            sc.useDelimiter("\\" + delimiter);

            double operand1 = sc.nextDouble();
            double operand2 = sc.nextDouble();

            double answer = 0;

            switch (delimiter) {
                case "+":
                    answer = operand1 + operand2;
                    break;
                case "-":
                    answer = operand1 - operand2;
                    break;
                case "*":
                    answer = operand1 * operand2;
                    break;
                case "/":
                    if (operand2 != 0) {
                        answer = operand1 / operand2;
                    } else {
                        throw new IllegalArgumentException("Division by zero.");
                    }
                    break;
            }
            return answer;
        }
    }
}
