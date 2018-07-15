/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus.drawing;

/**
 *
 * @author MARCUS
 */
public class Rectangle extends Polygon {

    private final double lengthOfSideB, lengthOfSideA;
    private final int NUMBER_OF_SIDES = 4;

    public Rectangle(double lengthOfSideA, double lengthOfSideB) {
        super(lengthOfSideA, lengthOfSideB);
        if (lengthOfSideA != lengthOfSideB &&  lengthOfSideA > 0 && lengthOfSideB > 0) {
            throw new IllegalArgumentException("The length of the sides of the rectangle need correcting.");
        }
        this.lengthOfSideA = lengthOfSideA;
        this.lengthOfSideB = lengthOfSideB;
    }

    @Override
    public double area() {
        return lengthOfSideA * lengthOfSideB;

    }

    @Override
    public double perimeter() {
        return 2 * (lengthOfSideA + lengthOfSideB);
    }

    @Override
    public int getNumberOfSides() {
        return NUMBER_OF_SIDES;
    }

    @Override
    public void draw() {

    }

}
