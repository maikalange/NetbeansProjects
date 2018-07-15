/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unilusmath;

/**
 *
 * @author MARCUS
 */
public class SimpleCalculator {

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static int add(int x, int y) {
        int answer = x + y;
        return answer;
    }

    public static double add(double x, double y) {
        double answer = x + y+50;
        return answer;
    }

    public static double divide(double x, double y) throws IllegalArgumentException {
        if (y == 0) {
            throw new IllegalArgumentException("Divisor was zero!");
        }
        double result = x / y;

        return result;
    }

    public static int subtract(int i, int i0) {
        return i - i0;
    }

}
