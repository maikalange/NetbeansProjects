/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112nyirendapt;

/**
 *
 * @author MARCUS
 */
public class Bit112NyirendaPt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int result = add(80, 33) + add(5, 2);
        int i = 0;
        //++i;
        i++;

        System.out.println(i);

    }

    public static double divide(double i, double j) {
        double quotient = i / j;
        return quotient;

    }

    public static int add(int i, int j) {
        int sum = i + j;
        return sum;

    }

    public static int subtract(int i, int j) {
        int result = i - j;
        return result;

    }

    public static int multiply(int i, int j) {
        int product = i * j;
        return product;

    }
}
