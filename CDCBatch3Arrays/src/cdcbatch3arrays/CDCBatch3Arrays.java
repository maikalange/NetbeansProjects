/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdcbatch3arrays;

/**
 *
 * @author MARCUS
 */
public class CDCBatch3Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] players = {"Messi", "Ronaldo", "Pogba", "Terry", "Sunzu"};

        for (int k = 0; k < players.length; k++) {
            System.out.println(players[k]);
        }

        double[] marks = {56, 75, 32, 78, 55, 77, 85, 58, 65, 60};
        double runningTotal = 0;
        for (int i = 0; i < marks.length; i = i + 1) {
            runningTotal = runningTotal + marks[i];
        }
        double averageMark = runningTotal / marks.length;
        System.out.println(" The average mark is:" + averageMark);
    }

}
