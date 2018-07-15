/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midsemesterseptember2016bit112;

/**
 *
 * @author MARCUS
 */
public class MidSemesterSeptember2016Bit112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(averageScore());
        int k = 0;
        while (k <= 150) {
            if (k % 5 == 0) {
                System.out.println(k);

            }
            k++;
        }
    }
    
    public static void testExpressions(){
        double x=5.6/4;
        Boolean result = (5==5);
    }

    public static double averageScore() {

        double[] scores = {65.6, 34.4, 95, 28, 56, 66, 68, 74, 55};

        double sumOfScores = 0;
        for (int i = 0; i < scores.length; i++) {
            sumOfScores = sumOfScores + scores[i];
        }
        return sumOfScores / scores.length;

    }

    public void multiply(int j) {
        System.out.println(j * 9);

    }

    public int multiply(int a, int k) {
        int result = a * k;
        return result;
    }

}
