/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112ptdowhiletutorial;

import java.util.Scanner;

/**
 *
 * @author MARCUS
 */
public class BIT112PTDoWhileTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = -1;
        do {
            System.out.println("Please enter a  number");
            number = sc.nextInt();
            if (number % 5 == 0) {
                System.out.println(number + " is a multiple of 5");
            } else if (number % 2 == 0) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }

        } while (number != 0);

    }

}
