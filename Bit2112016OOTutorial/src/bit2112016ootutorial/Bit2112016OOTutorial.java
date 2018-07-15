/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit2112016ootutorial;

/**
 *
 * @author MARCUS
 */
public class Bit2112016OOTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vehicle myBike  = new MotorBike(2, 4, 25, 1, false);
        myBike.startEngine();

        myBike.accelerate();
    }
    
}
