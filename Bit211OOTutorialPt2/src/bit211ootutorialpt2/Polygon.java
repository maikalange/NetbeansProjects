/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211ootutorialpt2;

/**
 *
 * @author MARCUS
 */
public abstract class Polygon implements Cloneable {

    public abstract double getArea();

    public double getNumberOfSides() {
        return numberOfSides;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public abstract double getPerimeter();
    protected double numberOfSides;
    protected double sideA;
    protected double sideB;

    public Polygon(double sideA, double numberOfSides) {
        this.sideA = sideA;
        this.numberOfSides = numberOfSides;
    }

    ;
    public Polygon(double sideA, double sideB, double numberOfSides) {
    }
;

}
