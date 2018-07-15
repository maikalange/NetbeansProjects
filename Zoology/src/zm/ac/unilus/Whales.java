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
public class Whales extends Mammal{

    @Override
    public void move() {
        System.out.println("Whale swims");
    }

    @Override
    public void Sleep() {
        System.out.println("Whale sleeps at night");
    }

    @Override
    public void cry() {
        System.out.println("Whale whales");
    }

    @Override
    public void eat() {
        System.out.println("Whale eats plankton");
    }
    
}
