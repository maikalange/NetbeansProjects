/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniluscollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author MARCUS
 */
public class UnilusCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Dog[] myPets = new Dog[10];
        myPets[0] = new Dog("Floppy", "Maroon", 453453);
       
        List<Dog> myDogs = new ArrayList<>();
       
        ArrayList<Dog> list = new ArrayList<>();
        list.add(new Dog("Poppy", "Red", 11412412));
        list.add(new Dog("Buster", "Yellow", 7457456));

        Dog myBestFriend = list.get(0);
        myBestFriend.wagTail();

        for (Dog d : list) {
            d.wagTail();
        }

        HashMap<Long, Dog> pets = new HashMap<>();
        pets.put(31232333L, new Dog("Misty", "Red", 31232333));
        pets.put(31232334L, new Dog("Suzy", "Green", 31232334));
        pets.put(31232335L, new Dog("Brown", "Blue", 31232335));
        pets.put(31232336L, new Dog("Smith", "Orange", 31232336));

        Dog favouritePet = pets.get(31232334L);
        favouritePet.wagTail();

        for (Dog d : pets.values()) {
            d.wagTail();
        }

    }
}
