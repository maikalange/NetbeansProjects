/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112ptmethodsarraytutorial;

import java.util.Scanner;

/**
 *
 * @author MARCUS
 */
public class BIT112PTMethodsArrayTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        //Display message to the user
        System.out.println("Please enter a value");
        
        //Get number from the command line
        int number = sc.nextInt();

        countTo(number);
        
        sc.close();
    }

    private static void countTo(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.println(j);
        }
    }
}
