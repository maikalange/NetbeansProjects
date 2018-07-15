/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unilusmath1;

/**
 *
 * @author MARCUS
 */
public class SimpleCalculator {

    public static int add(int x, int y) {
        return x +y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int[] getScores() {
        int[] scores = new int[5];

        for (int i = 0; i < scores.length; i++) {

            scores[i] = (int) (10 * Math.random());
        }

        return scores;
    }

    public static int[] getScores(int x) {
        int[] scores = new int[x];

        for (int i = 0; i < scores.length; i++) {

            scores[i] = (int) (100 * Math.random());
        }

        return scores;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

}
