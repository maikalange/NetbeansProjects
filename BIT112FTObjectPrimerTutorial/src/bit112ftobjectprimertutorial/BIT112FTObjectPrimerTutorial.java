/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112ftobjectprimertutorial;

/**
 *
 * @author MARCUS
 */
public class BIT112FTObjectPrimerTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cat tom = new Cat("Tom", 5, "Brown");
        tom.move(100);
        System.out.println(tom.IsAwake());
        tom.play();
        System.out.println(tom.IsAwake());
        tom.sleep();
        System.out.println(tom.IsAwake());

        //Create a blank array of cat objects of size 10
        Cat[] auntiesCats = new Cat[10];

        //We add cats to the array 
        for (int i = 0; i < auntiesCats.length; i++) {
            //Populate the array with cat objects
            auntiesCats[i] = new Cat("Fluffy" + i, 5, "Yellow");
        }

        //We call methods on the cats in the array, make cats move and sleep
        for (Cat c : auntiesCats) {
            c.move(120);
            c.sleep();
        }
    }

}
