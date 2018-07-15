/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211printstarstutorial;

/**
 *
 * @author MARCUS
 */
public class BIT211PrintStarsTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        printStars(2);
    }

    private static void printStars(int i) {
        for (int k = 0; k < i; k++) {
            for (int j = 0; j <= k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
