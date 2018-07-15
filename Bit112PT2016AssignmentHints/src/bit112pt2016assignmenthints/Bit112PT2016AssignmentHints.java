/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112pt2016assignmenthints;

import java.util.Scanner;

/**
 *
 * @author MARCUS
 */
public class Bit112PT2016AssignmentHints {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("****************************************");
        System.out.println(" MINISTRY OF HOME AFFAIRS");
        System.out.println("            VISA SECTION               ");
        System.out.println("Please enter the applicants age");
        int age = sc.nextInt();
        System.out.println("Please enter the funds available in $");
        double funds = sc.nextDouble();

        if (((age >= 18) && (age <= 25)) && funds >= 5000) {
            System.out.println("Issue work permit ");
        } else {
            System.out.println(" Please refer case to supervisor");
        }

    }

}
