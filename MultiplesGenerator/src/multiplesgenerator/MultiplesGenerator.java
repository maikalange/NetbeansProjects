/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplesgenerator;

import java.util.Scanner;

/**
 *
 * @author MARCUS
 */
public class MultiplesGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("This program will generate multiples for a given number entered by the user");
        System.out.println("Please enter a number:");
        int number = sc.nextInt();
        System.out.println("These are the multiples  of " + number);
        for (int i = 0; i < 10; i++) {
            int answer = i * number;
            System.out.println(answer);
        }
    }

}
