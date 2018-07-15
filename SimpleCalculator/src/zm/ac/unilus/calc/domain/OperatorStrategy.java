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
public abstract class OperatorStrategy {

    public OperatorStrategy(String expression){}
    public abstract double calculate();

    public abstract boolean isAnswer();
}
