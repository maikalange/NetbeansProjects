/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdcbatch3whileloops;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author MARCUS
 */
public class CDCBatch3WhileLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 0;

        while (number < 5) {
            System.out.println("Please enter a number greater than 5");
            number = sc.nextInt();

        }
    }
}
