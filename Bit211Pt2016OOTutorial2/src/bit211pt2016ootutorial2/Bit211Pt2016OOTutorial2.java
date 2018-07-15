/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211pt2016ootutorial2;

import java.util.Scanner;

/**
 *
 * @author MARCUS
 */
public class Bit211Pt2016OOTutorial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter side A of the triangle");
        double sideA = sc.nextDouble();

        System.out.println("Please enter side B of the triangle");
        double sideB = sc.nextDouble();

        System.out.println("Please enter side C of the triangle");
        double sideC = sc.nextDouble();

        System.out.println("Is the triangle filled Y/N");
        String isFilled = sc.next();
        boolean filled = false;

        if (isFilled == "Y" || isFilled == "y") {
            filled = true;
        }
        String color = null;
        if (filled) {
            System.out.println("Please enter  the color");
            color = sc.next();
        }


        GeometricObject myTriangle = new Triangle(sideA, sideB, sideC);

        myTriangle.setColor(color);
        myTriangle.setIsFilled(filled);

        double area = myTriangle.area();
        double perimeter = myTriangle.perimeter();
        String theColor = myTriangle.color();
        boolean triangleFilled = myTriangle.isFilled();

        System.out.println("The area is :" + area);
        System.out.println("The perimeter is :" + perimeter);
        System.out.println("The color is :" + theColor);
        System.out.println("The triangle is filled :" + triangleFilled);
    }

}
