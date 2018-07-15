/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112ptobjecttutorial;

/**
 *
 * @author MARCUS
 */
public class BIT112PTObjectTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create an instance of the Dog called poppy
        Dog d = new Dog("Buster", "maroon", 2);// this is a constructor for creating a dog
        d.bark();
        d.move(30);

        //Create an empty array of Dogs
        Dog[] pets = new Dog[3];

        //Populate the array with 3 dogs
        pets[0] = new Dog("Poppy", "brown", 1);
        pets[1] = new Dog("Gina", "orange", 2);
        pets[2] = new Dog("Tiger", "yellow", 3);

        //Get the dogs from the array
        for (int i = 0; i < pets.length; i++) {
            pets[i].move(10 * i + 5);
            pets[i].bark();
        }

        //Create an array of five integers
        int[] scores = new int[5];

        //populate the array
        for (int i = 0; i < scores.length; i++) {
            scores[i] = i * 5;
        }
        
        //Display the items in the array
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}
