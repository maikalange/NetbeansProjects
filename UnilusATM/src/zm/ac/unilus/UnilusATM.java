/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus;

import java.time.LocalTime;

/**
 *
 * @author MARCUS
 */
public class UnilusATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //System.out.println("Hello world");
        //int result = add(5, 15);
        //System.out.println(result);
        //countTo(20);
        //countDoWhile();
        System.out.println(isAfterHourOf(19));
    }

    private static void countTo(int k) {
        for (int i = 1; i <= k; i = i + 1) {
            System.out.println(i);
        }
    }

    private static void countWhile() {
        int i = 0;
        while (i <= 10) {
            i++;
            System.out.println(i);

        }
    }

    private static void countDoWhile() {
        int i = 0;
        do {

            i++;
            System.out.println(i);
        } while (i < 10);

    }

    private static int add(int i, int j) {
        int sum = i + j;
        return sum;
    }

    private static boolean isAfterHourOf(int hour) {
        boolean isAfterHour = LocalTime.now().isAfter(LocalTime.of(hour, 0));
        return isAfterHour;
    }

    public void switchExample(int number) {
        switch (number) {
            case 1:
                System.out.println("odd");
            case 2:
                System.out.println("odd");
        }
    }
}
