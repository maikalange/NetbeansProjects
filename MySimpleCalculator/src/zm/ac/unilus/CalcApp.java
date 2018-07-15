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
public class CalcApp {

    public static void main(String[] args) {
        try{
            double result = SimpleCalulator.divide(10, 0);
            System.out.println(result);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        String one  = "1";
        String two = "2";
        
        int result  = new Integer(one) + new Integer(two);
        
        System.out.println(result);
        
    }

}
