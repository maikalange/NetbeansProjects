/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus;

/**
 *
 * @author MARCUS
 */
public class StaticInstanceTutorial {
    
    public static void main(String[] args){
        //Instantiation 
        SimpleCalulator calc  = new SimpleCalulator();
        calc.multiply(45, 10);
        
        //call add method on SimpleCalculator
        int result  = SimpleCalulator.add(10, 12);
    }
}
