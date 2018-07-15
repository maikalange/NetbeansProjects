/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allianceconditionalstatements;

import java.util.ArrayList;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author MARCUS
 */
public class AllianceConditionalStatements {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        checkNumbers(11, 5);
        checkNumbers();
        
    } 

    
    private static void checkNumbers(int i, int j) {
        if (i == 10) {
            System.out.println("i is equal to 10");
        } else if (j == 5) {
            System.out.println("j is equal to 5");
        } else {
            System.out.println("i and j are not equal to 10 or 5");
        }
    }
    private static void checkNumbers() {
        Scanner sc = new Scanner(System.in);
        int k=-1;
        while (k <= 10) {
            System.out.println("Please enter a number less than or equal to 10");
            k = sc.nextInt();

            if (k % 5 == 0) {
                System.out.println("You entered a multiple of 5");
            } else if (k % 2 == 0) {
                System.out.println("You entered an even number");
            } else {
                System.out.println("You entered an odd number that is not a multiple of 5");
            }

        }
    }

}
