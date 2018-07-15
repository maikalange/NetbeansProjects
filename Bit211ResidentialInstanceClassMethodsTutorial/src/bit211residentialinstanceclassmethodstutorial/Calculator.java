/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211residentialinstanceclassmethodstutorial;

/**
 *
 * @author MARCUS
 */
public class Calculator {

    private double x;// well encapsulated fields they are not public
    private double y;// instance variables belong to instances of the calculator class

    /**
     * Constructor for the calculator class
     *
     * @param x
     * @param y
     */
    public Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * *
     * This is an instance method that returns the result of adding x and y
     * instance variables This method is non-static
     *
     * @return
     */
    public double add() {
        return x + y;
    }

    public double multiply() {
        return x * y;
    }

    public static double multiply(double i, double j) {
        return i * j;
    }

    /**
     * This is a class method because it is marked as static
     *
     * @param i
     * @param j
     * @return
     */
    public static double add(double i, double j) {
        return i + j;
    }
}
