/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus.math;

/**
 *
 * @author Mr J.A. Nyirenda
 */
public class Calculator {

    private double x;
    private double y;

    public Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double add() {
        return x + y;
    }

    public double divide() {
        return x / y;
    }
}
