/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit1122016extendedooprimer;

/**
 *
 * @author MARCUS
 */
public class Bit1122016ExtendedOOPrimer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c = new Circle(10);
        double a = c.area();
        System.out.println("The area is : " + a + " sq units");
        double p = c.perimeter();

        Circle[] circles = generateRandomCircles();
        for (Circle circle : circles) {
            System.out.println("Area is: " + circle.area());
            System.out.println("Perimeter: " + circle.perimeter());
        }
    }

    private static Circle[] generateRandomCircles() {
        Circle[] circles = new Circle[1000];
        for (int i = 0; i < circles.length; i++) {
            double r = Math.random() * 50;
            Circle c = new Circle(r);
            circles[i] = c;
        }
        return circles;
    }

}
