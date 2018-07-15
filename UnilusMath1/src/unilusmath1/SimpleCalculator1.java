/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unilusmath1;

import java.util.Arrays;

/**
 *
 * @author MARCUS
 */
public class SimpleCalculator1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] scores = SimpleCalculator.getScores(10);
        int temp;
        for (int i = 0; i < scores.length; i++) {
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[i] > scores[j]) {
                    
                    temp = scores[i];
                    
                    scores[i] = scores[j];
                    
                    scores[j] = temp;
                    
                }

            }

        }

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }

}
