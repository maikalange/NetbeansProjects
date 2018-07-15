/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus.calc;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JLabel;
import zm.ac.unilus.calc.domain.AddOperatorStrategy;
import zm.ac.unilus.calc.domain.OperatorStrategy;

/**
 *
 * @author MARCUS
 */
public class CalculatorController {

    private JLabel expressionLabel;

    private boolean isAnswer;
    private final CalculatorModel expressionModel;

    public CalculatorController(JFrame frame) {
        if (frame != null) {
            for (Component c : frame.getContentPane().getComponents()) {
                if (c instanceof JLabel) {
                    expressionLabel = (JLabel) c;
                    break;
                }
            }
        }

        this.isAnswer = false;
        this.expressionModel = new CalculatorModel();
    }

    private boolean containsOperator() {
        String currentExpression = expressionModel.getExpression().toString();
        int addIndex = currentExpression.indexOf("+");
        int minusIndex = currentExpression.indexOf("-");
        int productIndex = currentExpression.indexOf("*");
        int divideIndex = currentExpression.indexOf("/");

        return addIndex > 0 || (minusIndex > 0) || (productIndex > 0) || (divideIndex > 0);
    }

    void updateOperatorViewModel(String operator) {
        if (!containsOperator()) {
            expressionModel.setExpression(operator);
            expressionLabel.setText(expressionModel.getExpression().toString());
        }
    }

    void updateAnswerViewModel() {
        String answer = calculate(expressionModel.getExpression().toString());
        //set answer if valid operation
        if (isAnswer) {
            expressionModel.resetModel();
            expressionModel.setExpression(answer);
            expressionLabel.setText(expressionModel.getExpression().toString());
        }
    }

    void updateOperandViewModel(int operand) {
        if (isAnswer && !containsOperator()) {
            expressionModel.resetModel();
            isAnswer = false;
        }
        expressionModel.setExpression(Integer.toString(operand));
        expressionLabel.setText(expressionModel.getExpression().toString());
    }

    private String calculate(String expression) {
    
        String[] subtraction = expression.split("\\-");
        String[] division = expression.split("\\/");
        String[] multiplication = expression.split("\\*");

        double x, y, z = 0;
        
        OperatorStrategy addStrategy = new AddOperatorStrategy(expression);
        
        z = addStrategy.calculate();
        
        isAnswer = addStrategy.isAnswer();
        
     if (subtraction.length == 2 && !"".equals(subtraction[0]) && !"".equals(subtraction[1])) {
            x = new Double(subtraction[0]);
            y = new Double(subtraction[1]);
            z = x - y;
            isAnswer = true;

        } else if (division.length == 2 && !"".equals(division[0]) && !"".equals(division[1])) {
            isAnswer = true;
            x = new Double(division[0]);
            y = new Double(division[1]);
            if (y != 0) {
                z = x / y;
            } else {
                return "ERROR";
            }

        } else if (multiplication.length == 2 && !"".equals(multiplication[0]) && !"".equals(multiplication[1])) {
            x = new Double(multiplication[0]);
            y = new Double(multiplication[1]);
            z = x * y;
            isAnswer = true;
        }
        return Double.toString(z);
    }

    void resetModel() {
        expressionLabel.setText(null);
        expressionModel.resetModel();
    }
}
