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
public class Bear extends Mammal {

    @Override
    public void move() {
         System.out.println("Bear walks on two feet and four feet");
    }

    @Override
    public void Sleep() {
        System.out.println("Bear sleeps at night");
    }

    @Override
    public void cry() {
        System.out.println("Bear growls");
    }

    @Override
    public void eat() {
         System.out.println("Bear is a carnivore");
    }
    
}
