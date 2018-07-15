/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112ptwhileloopstutorial;

import java.util.Scanner;

/**
 *
 * @author MARCUS
 */
public class Bit112PtWhileLoopsTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        displayNumber();
        countTo(100);
    }

    private static void displayNumber() {
        Scanner s = new Scanner(System.in);
        int j = 0;
        while (j < 100) {
            System.out.println("Please enter a number greater than 100 ");
            j = s.nextInt();
        }
    }

    private static void countTo(int i) {
        int j = 0;
        while (j <= i) {
            System.out.println(j);
            j++;
        }

    }

}
