/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112ftswitchtutorial;

import java.util.Scanner;

/**
 *
 * @author MARCUS
 */
public class Bit112FtSwitchTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        double remainder = 1d%7d;
        System.out.println(remainder);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a valid day");

        int day = sc.nextInt();
        while (day > 0) {
            showDayOfWeek(day);//we invoke the method
            break;
        }
    }

    private static void showDayOfWeek(int i) {
        switch (i) {
            case 1:
                System.out.println("Mondays are a real pain");
                break;
            case 2:
                System.out.println("Tuesdays are better");
                break;
            default:
                System.out.println("Unable to find the day " + i);
        }
    }

}
