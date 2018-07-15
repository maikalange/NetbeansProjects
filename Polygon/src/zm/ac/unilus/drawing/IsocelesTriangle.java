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
public class IsocelesTriangle extends Polygon {

    private final int NUMBER_OF_SIDES = 3;
    private final double sideA, sideB, sideC;
    private double height;
    private double base;

    public IsocelesTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        if (!isValidIsoceles() || isZeroLength()||! isValidGeometry()) {
            throw new IllegalArgumentException(" Please provide the correct dimensions for the triangle");
        }
    }

    private boolean isZeroLength() {
        return sideA == 0 || sideB == 0 || sideC == 0;
    }

    private boolean isValidIsoceles() {
        if (sideA == sideB) {
            this.base = sideC;
            setHeight(sideA);
            return true;
        } else if (sideA == sideC) {
            this.base = sideB;
            setHeight(sideA);
            return true;
        } else if (sideC == sideB) {
            this.base = sideA;
            setHeight(sideB);
            return true;
        }
        return false;
    }

    private void setHeight(double equalSide1) {
        height = Math.sqrt((equalSide1 * equalSide1) - ((base * base) / 4));

    }

    private boolean isValidGeometry() {

        double semiPerimeter = perimeter() / 2;
        return (semiPerimeter - sideA > 0 && semiPerimeter - sideB > 0 && semiPerimeter - sideC > 0) ;
    }

    @Override
    public double area() {
        return 0.5 * base * height;

    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;

    }

    @Override
    public int getNumberOfSides() {
        return NUMBER_OF_SIDES;
    }

    @Override
    public void draw() {

    }

}
