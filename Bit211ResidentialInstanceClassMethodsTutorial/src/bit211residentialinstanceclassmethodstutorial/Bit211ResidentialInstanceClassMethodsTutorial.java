/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211residentialinstanceclassmethodstutorial;

import static java.lang.System.out;

/**
 *
 * @author MARCUS
 */
public class Bit211ResidentialInstanceClassMethodsTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //This is how to invoke a class method
        double result  = Calculator.add(23, 15);
        double result3 = Calculator.multiply(23, 12);
        
        out.println(result);
        
        //This is how to invoke an instance method
        Calculator c  = new Calculator(45, 12);
        double result1 = c.add();
        double result2 = c.multiply();
        out.println(result1);
    }
}
