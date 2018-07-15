/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211ftscannertutorial;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author MARCUS
 */
public class BIT211FTScannerTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = -1;
        try {
            while (i < 100) {
                System.out.println("Please enter a number greater than 100.");
                {
                    i = sc.nextInt();
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("An error occured please enter valid input " + e.getMessage());
        } finally {
            sc.close();
        }

    }
}
