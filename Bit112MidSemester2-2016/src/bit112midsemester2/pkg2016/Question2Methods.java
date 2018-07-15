package bit112midsemester2.pkg2016;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARCUS
 */
public class Question2Methods {

    public int multiply(int a, int k) {
        int result = a * k;

        return result;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public double averageScore() {
        double[] scores = {65.6, 34.4, 95, 28, 56, 66, 68, 74, 55};
        double sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        return sum / scores.length;
    }
}
