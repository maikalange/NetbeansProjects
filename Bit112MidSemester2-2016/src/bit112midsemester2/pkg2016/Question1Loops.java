/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112midsemester2.pkg2016;

/**
 *
 * @author MARCUS
 */
public class Question1Loops {

    public void displayMultiples() {
        int k = 1;
        do {
            if (k % 5 == 0) {
                System.out.println(k);
                k++;
            }
        } while (k <= 150);
    }

    public void displayMultiplesForLoop() {
        for (int k = 0; k <= 150; k++) {
            if (k % 5 == 0) {
                System.out.println(k);
            }
        }
    }

    public void displayMultiplesWhileLoop() {
        int k = 1;
        while (k <= 150) {
            if (k % 5 == 0) {
                System.out.println(k);
            }
            k++;
        }
    }

    public void storeFirst15Multiples() {
        int[] multiples = new int[15];
        int k = 1;
        int j = 0;
        do {
            if (k % 5 == 0) {
                if (j < 15) {
                    multiples[j] = k;
                    j++;
                }

                k++;
            }
        } while (k <= 150);

    }
}
