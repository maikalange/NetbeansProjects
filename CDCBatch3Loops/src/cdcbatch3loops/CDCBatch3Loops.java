/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdcbatch3loops;

/**
 *
 * @author MARCUS
 */
public class CDCBatch3Loops {

    public static void main(String[] args) {

        int runningTotal = 0;
        for (int k = 1; k <= 20; k = k + 1) {

            if (k % 2 == 0) {
                System.out.println(k);
                runningTotal = runningTotal + k;
            }
        }
        System.out.println("The total is:" + runningTotal);
    }
}
