/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112ftmethodoverloading;

/**
 *
 * @author MARCUS
 */
public class BIT112FTMethodOverLoading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        long result = add(10L, 30L);
        int result1 = add(10, 10);
        double result2 = add(10D, 10D);

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        
    }

    private static long add(long x, long y) {
        return x + y;
    }

    private static int add(int x, int y) {
        return x + y;
    }

    private static double add(double x, double y) {
        return x + y;
    }
}
