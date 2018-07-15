/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211residentialloopstutorial;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author MARCUS
 */
public class Bit211ResidentialLoopsTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        printMessage();
        isOddOrEven();
        printMessageNTimes(0);
    }

    private static void printMessage() {
        boolean boolean_expression = true;
        int count = 1;
        while (boolean_expression) {
            System.out.println("Hello Teddy");
            count++;//same as count=count+1;
            if (count == 200) {
                boolean_expression = false;
            }
            out.println(count);
        }
    }

    /**
     * *
     * Determines whether a number is odd or even
     */
    private static void isOddOrEven() {
        Scanner sc = new Scanner(System.in);
        int userValue = -1;
        while (userValue <= 100) {
            out.println("Please enter a number less than a 100");
            userValue = sc.nextInt();

            if (userValue % 2 == 0) {
                out.println("You entered an even number");
            } else {
                out.println("You entered an odd number");
            }
        }
        sc.close();
    }

    /**
     * *
     *
     * @param i The number of times to print a message
     */
    public static void printMessageNTimes(int i) {
        int count = 1;
        do {
            out.println("Hello World");
            count++;
        } while (i >= count);
    }
}
