/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalstatements;

/**
 *
 * @author MARCUS
 */
public class ConditionalStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int number = 13;

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd Number");
        }

//        System.out.println(5 > 3);
//        System.out.println(5 <= 3);
//        System.out.println(5 > 3);
//        
//        System.out.println(3 == 3);
//        
        for (int i = 0; i <= 10; i++) {
            if ((i % 2 == 1)) {
                System.out.println(i);
            }else{
                System.out.println(i*10);
            }
        }
    }

}
