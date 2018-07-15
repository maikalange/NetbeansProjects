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
public class Rectangle extends Polygon {

    public Rectangle(double sideB, double sideA) {
        super(sideA, sideB);
    }

    @Override //allows to specify behaviour that is specific to the rectangle class
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public double getPerimeter() {
        return 2 * (sideA + sideB);
    }
}
