/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus.calc.domain;

/**
 *
 * @author MARCUS
 */
public class AddOperatorStrategy extends OperatorStrategy {
    private boolean isAnswer;

    private final String expression;
    public AddOperatorStrategy(String expression) {
        super(expression);
        this.expression = expression;
    }

    
    @Override

    public double calculate() {
        String[] addition = expression.split("\\+");
        double x, y, z = 0;
        if (addition.length == 2 && !"".equals(addition[0]) && !"".equals(addition[1])) {
            //add two numbers
            x = new Double(addition[0]);
            y = new Double(addition[1]);
            z = x + y;
            isAnswer = true;

        }
        return z;
    }

    @Override
    public boolean isAnswer() {
        return isAnswer;
    }

}
