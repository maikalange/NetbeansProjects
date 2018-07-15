/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112conditionalstutorial;

/**
 *
 * @author MARCUS
 */
public class BIT112ConditionalsTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int max = 0;
        if (max != 0) {
            System.out.println(max);
        } else {
        }
    }

    private static void checkNumbers(int i, int j) {
        if (i % 5 == 0) {
            System.out.println(i + " multiple of 5");
        } else if (j % 2 == 0) {
            System.out.println(j + " is an even number");
        } else if (i % 3 == 0) {
            System.out.println(i + " is an even number");
        } else {
            System.out.println("The numbers are not multiples of 2,5 or 3");
        }
    }

    private static void checkNumbers(int i) {
        switch (i) {
            default:
                System.out.println("Number entered is not 1 or 2");
                break;
            case 1:
                System.out.println("Entered 1");
                break;
            case 2:
                System.out.println("Entered 2");
                break;
        }
    }
}
