/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit1122016stacktutorial;

import java.util.Stack;

/**
 *
 * @author MARCUS
 */
public class Bit1122016StackTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String addExpression = "5+4+7+12+13";
        String[] operands = addExpression.split("\\+");

        double total = 0;
        for (String operand : operands) {
            total = Double.parseDouble(operand) + total;
        }
        System.out.println(total);
        expressionStackCalculator();
    }

    private static void expressionStackCalculator() {
       Stack<String> addExpression  = new Stack<>();
       addExpression.push("5");
       addExpression.push("+");
       addExpression.push("4");
       
       String value  = addExpression.peek();
       
    }

}
