/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211residentialhomework;

import static java.lang.System.out;
import zm.ac.unilus.residential.Polygon;
import zm.ac.unilus.residential.Rectangle;
import zm.ac.unilus.residential.Square;

/**
 *
 * @author MARCUS
 */
public class Bit211ResidentialHomework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Polygon mySquare = new Square(10, 10);
        double areaSquare = mySquare.getArea();
        double perimeterSquare = mySquare.getPerimeter();

        out.println("The area of the square is:" + areaSquare);
        out.println("The perimeter of the square is:" + perimeterSquare);

        Polygon r = new Rectangle(12, 3);

        out.println("The area of the rectangle is " + r.getArea());
        out.println("SideA is: " + r.getSideA());
        //sideA is now updated to 10 units
        r.setSideA(10);
        out.println("The area of the rectangle is " + r.getArea());
        out.println("SideA is: " + r.getSideA());

    }

}
