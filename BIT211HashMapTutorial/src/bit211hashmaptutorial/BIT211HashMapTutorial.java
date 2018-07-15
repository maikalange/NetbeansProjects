/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211hashmaptutorial;

import java.util.HashMap;

/**
 *
 * @author MARCUS
 */
public class BIT211HashMapTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap pets = new HashMap();

        pets.put("Misty", new Dog("Misty"));
        pets.put("Spot", new Dog("Spot"));
        pets.put("Gonzo", new Dog("Gonzo"));

        System.out.println(pets);
        
        //Downcast object to Dog type
        Dog d = (Dog) pets.get("Gonzo");

        //Strongly typed hashmap using Generics
        HashMap<String, Dog> pets1 = new HashMap<>();
        pets1.put("Buster", new Dog("Buster"));
        pets1.put("Jungle", new Dog("Jungle"));
        
        System.out.println(pets1);
        
        for(Dog dog: pets1.values()){
            dog.wagTail();
        }
    }

}
