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
public class Square extends Polygon {
    private final int NUMBER_OF_SIDES = 4;
    private final double lengthOfSide;

    public Square(double lengthOfSide) {
        super(lengthOfSide);
        if (lengthOfSide <= 0) {
            throw new IllegalArgumentException(" Please check the length of the side.");
        }
        this.lengthOfSide = lengthOfSide;
    }

    @Override
    public double area() {
        return lengthOfSide * lengthOfSide;
    }

    @Override
    public double perimeter() {
        return 4 * lengthOfSide;
    }

    @Override
    public int getNumberOfSides() {
        return NUMBER_OF_SIDES;
    }

    @Override
    public void draw() {

    }

}
