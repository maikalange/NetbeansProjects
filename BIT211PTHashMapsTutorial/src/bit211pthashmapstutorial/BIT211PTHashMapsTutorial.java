/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211pthashmapstutorial;

import java.util.HashMap;

/**
 *
 * @author MARCUS
 */
public class BIT211PTHashMapsTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String,Integer> playerGoals = new HashMap<>();
        playerGoals.put("Messi",33);
        playerGoals.put("Ronaldo",26);
        playerGoals.put("Sergio",18);
        playerGoals.put("Rooney",12);
        
        //Displays all the values in the HashMap
        for(Integer goals:playerGoals.values()){
            System.out.println(goals);
        }
       //Display keys and corresponding values 
        System.out.println(playerGoals);
        
        //Get single items
        int rooneyGoals  = playerGoals.get("Rooney");
        System.out.println(rooneyGoals);
    }
}
