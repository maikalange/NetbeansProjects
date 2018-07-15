/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211ftswitchtutorial;

import java.util.Scanner;

/**
 *
 * @author MARCUS
 */
public class BIT211FTSwitchTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = -1;
        while (month <= 12) {
            System.out.println("Please enter the month number");
            month = sc.nextInt();

            switch (month) {
                default:
                    System.out.println("Could not find the corresponding month");
                    break;
                case 3:
                    System.out.println("March");

                case 1:
                    System.out.println("January");

                case 2:
                    System.out.println("February");


                case 4:
                    System.out.println("April");
                    break;

            }
        }

    }

}
