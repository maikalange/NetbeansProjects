/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211_pt_arrays;

/**
 *
 * @author MARCUS
 */
public class BIT211_PT_Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] goalsScored = getGoalsScored(10);
        for (int i = 0; i < goalsScored.length; i++) {
            System.out.println(goalsScored[i]);
        }
        //develop some code to sort the array 


    }

    private static int[] getGoalsScored(int length) {
        int[] scores = new int[length];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = (int) (5 * Math.random());
        }

        return scores;

    }
    
        private static int[] getGoalsScored() {
        int[] scores = new int[30];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = (int) (5 * Math.random());
        }

        return scores;
    }

    private static void isEvenNumber() {

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                System.out.println(i * 10);
            }
        }

    }



    private static void WhileLoopExample(int[] scores) {
        int i = 0;
        while (i < scores.length) {
            System.out.println(scores[i]);
            i++;
        }
    }

    private static void doWhileLoopExample(int[] scores) {
        int i = 0;
        do {
            System.out.println(scores[i]);
            i++;
        } while (i < scores.length);

    }
}
