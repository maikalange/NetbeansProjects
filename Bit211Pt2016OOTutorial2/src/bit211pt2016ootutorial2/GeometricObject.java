/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211pt2016ootutorial2;

/**
 *
 * @author MARCUS
 */
public abstract class GeometricObject {

    protected double sideA, sideB, sideC;
    protected String color;
    protected boolean isFilled;

    public GeometricObject(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC  = sideC;
    }

    public abstract double perimeter();

    public abstract double area();

    public abstract String color();

    public abstract boolean isFilled();

    public abstract void setIsFilled(boolean isFilled);

    public abstract void setColor(String color);
}
