/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit1122017scannertutorial;

import java.util.Scanner;

/**
 *
 * @author MARCUS
 */
public class Bit1122017ScannerTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instantiates new scanner object
        Scanner nameScanner = new Scanner(System.in);
        //prints prompt for the user
        System.out.println("Please enter your name");
        //gets input from user and assigns it to the username variable
        String userName = nameScanner.next();
        //invoke/call the two methods and pass the username to each method
        processName(userName);
        reverseName(userName);
        double result = add(5.9, 4.5);
        System.out.println(result);
        double result1 = multiply(56.5, 23.78);
        System.out.println(result1);
    }

    private static void reverseName(String userName) {
        char[] letters = userName.toCharArray();
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
    }

    private static void processName(String name) {
        System.out.println(name.toUpperCase());
    }

    private static double add(double x, double y) {
        return x + y;
    }

    private static double multiply(double x, double y) {
        return x * y;
    }

}
