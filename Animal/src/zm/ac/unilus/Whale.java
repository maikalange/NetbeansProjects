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
public class Whale extends Mammal {

    @Override
    public void cry() {
        System.out.println("it cries responding to other injured whales");
    }

    @Override
    public void move() {
        System.out.println("it moves up and down by swimming and diving");
    }

    @Override
    public void sleep() {
         System.out.println("it sleeps at the surface of the water");
    }

    @Override
    public void eat() {
         System.out.println("it eats contaminated fish");
    }
    
}
