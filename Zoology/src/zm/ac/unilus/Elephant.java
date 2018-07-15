/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus;

/**
 *
 * @author touch
 */
public class Elephant extends Mammal {

    @Override
    public void move() {
        System.out.println("Elephant stomps");
    }

    @Override
    public void Sleep() {
         System.out.println("Elephant sleeps during the day");
    }

    @Override
    public void cry() {
        System.out.println ("Elephant trumpets");
    }

    @Override
    public void eat() {
        System.out.println ("Elephant is a herbivore");
    }
    
}
