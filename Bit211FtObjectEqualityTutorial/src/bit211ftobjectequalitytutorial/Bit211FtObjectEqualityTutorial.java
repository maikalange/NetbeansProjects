/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211ftobjectequalitytutorial;

import zm.ac.unilus.community.domain.Circle;
import zm.ac.unilus.community.domain.Topic;

/**
 *
 * @author MARCUS
 */
public class Bit211FtObjectEqualityTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Topic t = new Topic("Cummins ISM");
        
        Topic t1  = new Topic("cummins m11");
        boolean isEqual = t.equals(t1);
        
        Circle c  = new Circle(10);
        Circle c2  = new Circle(10);
        boolean sameCircle  = c.equals(c2);
        
    }
    
}
