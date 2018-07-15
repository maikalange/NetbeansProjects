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
public abstract class Polygon {

    public abstract double area();

    public abstract double perimeter();

    public abstract int getNumberOfSides();

    public abstract void draw();
    
    public Polygon(double length,double width){};

    public Polygon(double lengthOfSide) {
    }

    ;

    public Polygon(double sideA, double base, double height) {
    }

    ;
        public Polygon(double lengthOfSideA, double lengthOfSideB, double lengthOfSideC, double lengthOfSideD) {
    }
;
}
