/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unilusmath;

import com.sun.javafx.css.CalculatedValue;

/**
 *
 * @author MARCUS
 */
public class UnilusMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Create a new instance of the simple calculator
        SimpleCalculator calc  = new SimpleCalculator();
        
        SimpleCalculator.add(10, 5);// static
        
        calc.multiply(15, 23);// non-static
        
        //method overloading
        
        double result  = SimpleCalculator.add(10.8, 1);
        
        System.out.println(result);
    }

}
