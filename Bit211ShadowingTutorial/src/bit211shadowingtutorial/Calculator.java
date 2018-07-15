/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211shadowingtutorial;

/**
 *
 * @author MARCUS
 */
public class Calculator {

    //fields represent an objects data

    private double result;
    protected double x;
    protected double y;

    public Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double add() {
  
        result = x + y;
        return result;
    }

    public int add(int range) {
        int a = (int) (range * Math.random());
        int b = (int) (range * Math.random());
        return a + b;
    }

}
