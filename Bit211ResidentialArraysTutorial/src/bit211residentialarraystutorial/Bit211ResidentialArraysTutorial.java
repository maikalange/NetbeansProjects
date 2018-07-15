/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211residentialarraystutorial;

import static java.lang.System.out;

/**
 *
 * @author MARCUS
 */
public class Bit211ResidentialArraysTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        printChelseaScores();

        printRandomScores(5);
    }

    private static void printRandomScores(int numberOfGames) {
        int[] scores = new int[numberOfGames];

        for (int i = 0; i < scores.length; i++) {
            //Populating the array using a random number generator
            int score = (int) (Math.random() * 10);

            scores[i] = score;

        }

        //display the contents of the array
        for (int i : scores) {
            out.print(i + ",");
        }
        out.println();
    }

    private static void printChelseaScores() {
        int[] chelseaScores = {0, 1, 2, 1, 4, 1, 1, 1, 1};

        //navigate the loop in reverse order
        for (int i = chelseaScores.length - 1; i >= 0; i--) {
            out.println(chelseaScores[i]);
        }
    }
}
