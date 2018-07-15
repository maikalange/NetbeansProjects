/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus;

/**
 *
 * @author mrs k
 */
public class Lion extends Mammals {

    @Override
    public void move() {
        System.out.println("Like my fellow cats, i too have paws.");
    }

    @Override
    public void eat() {
        System.out.println("I am a full time Carnivore.");
    }

    @Override
    public void cry() {
        System.out.println("I roar to signal my current state of mind!");
    }

    @Override
    public void sleep() {
        System.out.println("I love taking siestas in the shade, especially when the Lionesses are out hunting.");
    }
    
}
