/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211201600primertutorial;

/**
 *
 * @author MARCUS
 */
public class Bit211201600PrimerTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Square mySquare = new Square(13);
        double areaResult = mySquare.area();
        double perimeterResult = mySquare.perimeter();

        System.out.println("The area of the square is " + areaResult + " sq. meters");
        System.out.println("The perimeter of the square is " + perimeterResult + "meters");

        mySquare.setSideA(77);//change the value of sideA
        System.out.println("The area of the square is " + mySquare.area() + " sq. meters");
        System.out.println("The perimeter of the square is " + mySquare.perimeter() + "meters");
    }

}
