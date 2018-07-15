/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus.residential;

/**
 *
 * @author MARCUS
 */
public abstract class Polygon {
    protected double sideA;
    protected double sideB;

    public abstract double getArea();
    public abstract double getPerimeter();

    public Polygon(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Polygon(double sideA) {
        this.sideA = sideA;
    }

    public Polygon() {
    }

    public double getSideA() {
        return this.sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
}
