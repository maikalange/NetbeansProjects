/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.co.marcus;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author MARCUS
 */
public class ArrayListTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Dog> pets = new ArrayList<>();
        pets.add(new Dog("Poppy", 1));
        pets.add(new Dog("Buster", 1));
        pets.add(new Dog("Micky", 2));
        pets.add(new Dog("Brown", 3));

        Dog poppy = pets.get(0);
        poppy.wagTail();
        
        ArrayList<ArrayList<?>> test = new ArrayList<>();
        ArrayList<Toy> toys = new ArrayList<>();
        
        test.add(pets);
        test.add(toys);
        
        for (ArrayList a: test) {
            Class c = a.getClass();
            
        }


    }

}
