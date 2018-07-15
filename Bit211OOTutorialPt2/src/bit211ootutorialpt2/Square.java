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
public class Square extends Polygon {

    public Square(double sideA, double numberOfSides) {
        super(sideA, numberOfSides);
        if (numberOfSides != 4) {
            throw new IllegalArgumentException("Check the number of sides ");
        }
    }

    @Override
    /**
     * Override the protected clone method defined in the Object class, and
     * strengthen its accessibility
     */
    public Object clone() throws CloneNotSupportedException  {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        boolean areEqual = false;
        if (o instanceof Square) {
            return (this.sideA == ((Square) o).sideA);
        }

        return areEqual;
    }

    @Override
    public double getArea() {
        double area = sideA * sideA;
        return area;
    }

    @Override
    public double getPerimeter() {
        return 4 * sideA;
    }

}
