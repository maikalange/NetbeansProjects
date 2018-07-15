/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus.calc;

/**
 *
 * @author MARCUS
 */
public class CalculatorModel{

    public CalculatorModel() {
        this.expressionModel = new StringBuilder();
    }

    void resetModel() {
        expressionModel = new StringBuilder();
    }
    
    public StringBuilder getExpression(){
        return expressionModel;
    }

    private StringBuilder expressionModel;

    void setExpression(String number) {
        expressionModel.append(number);
    }
}
