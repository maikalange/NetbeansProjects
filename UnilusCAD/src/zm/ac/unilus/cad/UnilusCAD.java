/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus.cad;

import java.time.LocalTime;
import zm.ac.unilus.drawing.IsocelesTriangle;
import zm.ac.unilus.drawing.Polygon;
import zm.ac.unilus.drawing.Square;

/**
 *
 * @author MARCUS
 */
public class UnilusCAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Polygon p = new IsocelesTriangle(13,13,1);
        double perimeter  = p.perimeter();
        double area = p.area();
        
        Square s = new Square(0);
        double ps = s.perimeter();
        double pa = s.area();
        
        System.out.println("The area of the square is: " + pa);
    }
    
    private static void checkTime(){
        boolean time = LocalTime.now().isBefore(LocalTime.MIDNIGHT);
    }
    
}
