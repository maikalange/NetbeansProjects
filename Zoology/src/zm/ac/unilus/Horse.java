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
public class Horse extends Mammal {

    @Override
    public void move() {
         System.out.println("Horse gallops");
    }

    @Override
    public void Sleep() {
        System.out.println("Horse sleeps during thr night");
    }

    @Override
    public void cry() {
        System.out.println("Horse neighs");
    }

    @Override
    public void eat() {
        System.out.println("Horse is a herbivore");
    }
    
}
