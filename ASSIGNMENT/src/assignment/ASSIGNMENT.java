/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author JOE SIKAZWE
 */
public class ASSIGNMENT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("FwizzBizz");

            } else if (i % 2 == 0) {
                System.out.println("Fwizz");

            } else if (i % 5 == 0) {
                System.out.println("Bizz");

            } else {
                System.out.println(i);
            }

        }
    }

    public static void countTo() {
        int j = (19);

        for (int i = j; j >= 0; j--) {

            int remainder = j;
            if (remainder != 0);

            System.out.println(j);

        }
    }
}
