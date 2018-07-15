/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211switchtutorial;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author MARCUS
 */
public class BIT211SwitchTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
                
        int month = -1;
        while (month <= 12) {
            //try {
            System.out.println("Please enter the month number");
            try {
                month = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please provide a valid month ." + e.getMessage());
            }

            switch (month) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                default:
                    System.out.println("Could not find the requested month in the Gregorian Calendar");

            }
        }
    }
}
