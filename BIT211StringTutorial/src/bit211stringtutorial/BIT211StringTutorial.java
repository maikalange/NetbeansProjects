/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211stringtutorial;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author MARCUS
 */
public class BIT211StringTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = new String("Hello World");
        String s1 = "Hello World";

        
        
        System.out.println(s.equals(s1));

        String s3 = s.concat(s1);

        System.out.println(s3);

        boolean s4 = s3.contains("World");
        System.out.println(s4);
        System.out.println(s3.subSequence(2, 5));

        //The expression to evaluate
        String expression = "12/7";
        
        //Split the expression
        String[] parts = expression.split("\\/");
        
        double num1 = Double.valueOf(parts[0]);
        double num2 = Double.valueOf(parts[1]);
        
        //Add the numbers
        System.out.println(num1 / num2);

    }

}
