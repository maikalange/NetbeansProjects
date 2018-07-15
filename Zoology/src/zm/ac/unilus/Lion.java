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
public class Lion extends Mammal {

    @Override
    public void move() {
        System.out.println("Lion strides");
    }

    @Override
    public void Sleep() {
        System.out.println("Lion sleeps during the day and at night");
    }

    @Override
    public void cry() {
        System.out.println("Lion roars");
    }

    @Override
    public void eat() {
       System.out.println("Lion is a carnivore");
    }
    
}
