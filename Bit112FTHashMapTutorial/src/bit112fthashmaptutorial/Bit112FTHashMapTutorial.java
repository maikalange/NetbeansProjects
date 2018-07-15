/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112fthashmaptutorial;

import java.util.HashMap;
import java.util.function.BiConsumer;
import javax.swing.JLabel;

/**
 *
 * @author MARCUS
 */
public class Bit112FTHashMapTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //We create a new hashmap object
        HashMap<String, Integer> playerScores = new HashMap();
        //We populate the hashmap
        playerScores.put("Mayuka", 5);
        playerScores.put("Balotelli", 2);
        playerScores.put("Messi", 20);
        playerScores.put("Ronaldo", 35);

        //Lambda expressions
//        playerScores.forEach((name, goals) -> {
//            System.out.println(" The goals scored by " + name + " are " + goals);
//        });

        //Get items from the collection
        for (Integer score : playerScores.values()) {
            System.out.println(score);
        }
        
        System.out.println(playerScores);
    }

}
