/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112ft_nyirenda;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author MARCUS
 */
public class BIT112FT_Nyirenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] actualResults = {1, 4, 0, 3, 3, 1}; // data source
       

        int[] nkanaScores = new int[6];
        for (int i = 0; i < nkanaScores.length; i++) {
            //Populating an array
            nkanaScores[i] = actualResults[i];
            if (nkanaScores[i] == 3) {
                System.out.println(nkanaScores[i]);
            }

        }
        

    }

    private static void doWhileBuggy() {

        int count = 0;

        while (count <= 20) {

            int remainder = count % 2;

            if (remainder == 1) {
                System.out.println(count * 2);
            }
            count++;
        }
    }

    private static void oddNumbers() {
        for (int i = 1; i <= 10; i++) {

            int remainder = i % 2;

            if (remainder == 1) {
                System.out.println("Odd number: " + i);
            }
        }
    }

    private static void doWhileExample() {
        int count = 1;
        do {
            System.out.println(count);
            count++;

        } while (count <= 10);
    }

    private static void whileExample() {
        // TODO code application logic here

        int count = 1;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }
    }

    private static void exampleMethod() {
        System.out.println(" I am a small method");
    }

    private static void forExample() {
        for (int i = 1; i <= 10; i = i + 1) {

            System.out.println(i);
        }
    }

    private static void ifExample() {
        boolean test = 2 == 2;

        if (test) {
            System.out.println("Is True");
        } else {
            System.out.println("Is False");
        }
    }

}
