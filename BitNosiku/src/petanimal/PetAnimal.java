/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petanimal;

/**
 *
 * @author Nosiku
 */
import zm.ac.unilus.*;

public class PetAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Code that calls the Goat class, and performs the methods in the Mammal abstract class*/
        /*Returns new instance of an object*/
        Goat G = new Goat();
        G.title();
        G.cry();
        G.move();
        G.sleep();
        G.eat();
        /*Code that calls the Dog class, and performs the methods in the Mammal abstract class*/
        /*Returns new instance of an object*/
        Dog D = new Dog();
        D.title();
        D.cry();
        D.move();
        D.sleep();
        D.eat();
        /*Code that calls the Whale class, and performs the methods in the Mammal abstract class*/
        /*Returns new instance of an object*/
        Whale W = new Whale();
        W.title();
        W.cry();
        W.move();
        W.sleep();
        W.eat();

    }

}
