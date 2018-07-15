/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all2909datastructures;

import java.util.ArrayList;

/**
 *
 * @author MARCUS
 */
public class All2909DataStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Dog> pets = new ArrayList<>();
        pets.add(new Dog("Poppy"));
        pets.add(new Dog("Spot"));
        pets.add(new Dog("Buster"));

        //for each Dog d in pets
        for (Dog d : pets) {
            d.wagTail();
        }
        ArrayList pets1 = new ArrayList();
        pets1.add(new Dog("Sandy"));
        pets1.add(new Dog("Misty"));
        //Always use diamond notation when declaring arraylist
        for(Object object:pets1){
            ((Dog)object).wagTail();
        }
    }

}
