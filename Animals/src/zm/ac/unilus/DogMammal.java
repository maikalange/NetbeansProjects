/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus;

/**
 *
 * @author SIAFWA FAMILY
 */
public class DogMammal extends Mammal {

    @Override
    public void cry() {
        System.out.println("A dog barks");
    }

    @Override
    public void move() {
        System.out.println("A dog runs on all fours");

    }

    @Override
    public void eat() {
        System.out.println("a dog licks,bites and chews its food");
    }

    @Override
    public void sleep() {
        System.out.println("A dog sleeps in intervals through out the day");

    }
}
