/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211residentialclassdiagramstutorial;

import static java.lang.System.out;

/**
 *
 * @author MARCUS
 */
public class Bit211ResidentialClassDiagramsTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle myCircle  = new Circle(10.5);
        double area  = myCircle.getArea(); //invoking the getArea method to calculate the area 
        double perimeter  = myCircle.getPerimeter(); //invoking the getPerimeter method to calculate the perimeter

        out.println("The area is: " + area);
        out.println("The perimeter is: " + perimeter);
        

    }
    
}
