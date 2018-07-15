/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211ptarraylisttutorial;

import java.util.ArrayList;

/**
 *
 * @author MARCUS
 */
public class BIT211PTArrayListTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Dog> pets = new ArrayList<>();
        pets.add(new Dog("Spot"));
        pets.add(new Dog("Misty"));
        pets.add(new Dog("Sandy"));
        
        for(Dog d:pets){
            d.wagTail();
        }
        //Get a single item from the arraylist
        Dog d = pets.get(1);
        d.wagTail();
        
        ArrayList pets1 = new ArrayList();
        pets1.add(new Dog("Fluffy"));
        pets1.add(new Dog("Gonzo"));
        
        for(Object pet: pets1){
            ((Dog)pet).wagTail();
        }
        
    }
    
}
