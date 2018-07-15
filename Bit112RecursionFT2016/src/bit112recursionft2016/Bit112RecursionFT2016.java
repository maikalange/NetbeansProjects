/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112recursionft2016;

/**
 *
 * @author MARCUS
 */
public class Bit112RecursionFT2016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int result = printSeries(0);
        System.out.println(result);
    }

    public static int printSeries(int k) {
        if (k != 0) {
            return k * printSeries(k - 1);
        } else {
            return 1;
        }

    }

}
