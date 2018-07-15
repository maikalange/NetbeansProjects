/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus;

/**
 *
 * @author PATRICIA NDUME
 */
public class Goat extends Mammal {

    @Override
    public void cry() {
        System.out.println("it cries ");
    }

    @Override
    public void move() {
        System.out.println("it moves around to search for food");
    }

    @Override
    public void sleep() {
        System.out.println("it sleeps and wakes up early hours of the morning");
    }

    @Override
    public void eat() {
        System.out.println("it eats grass and maize");
    }
    
}
