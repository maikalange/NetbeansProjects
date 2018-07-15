/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allianceswitchstatement;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author MARCUS
 */
public class AllianceSwitchStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
DecimalFormat f = new DecimalFormat();
f.getCurrency().getSymbol();
        checkMonth();
    }

    private static void checkMonth() {
        Scanner sc = new Scanner(System.in);
        int k = -1;
        while (k <= 12) {
            System.out.println("Please enter the month number");
            k = sc.nextInt();
            switch (k) {
                case 1:
                    System.out.println("January");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                default:
                    System.out.println("Could not find the month");
                    break;
            }
        }
    }

}
