/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112lisaassignment2;

import java.util.Scanner;

/**
 *
 * @author LISA KABENGELE
 */
public class BIT112LisaAssignment2 {

    /**
     * @param args the command line arguments /
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int i = 0;
        try (Scanner sc = new Scanner(System.in)) {

            int j;
            j = 100;
            while (100 > i) {

                i = 1 + i;
                if (i % 5 == 0 && 0 == i % 2) {
                    System.out.println("fwizzBizz");
                } else if (0 == i % 2) {
                    System.out.println("fwizz");
                } else if (i % 5 == 0) {
                    System.out.println("Bizz");

                } else {
                    System.out.println(i);

                }
            }

        }

    }

}
