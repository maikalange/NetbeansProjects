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
public class WhaleMammal extends Mammal {

    @Override
    public void cry() {
       System.out.println ("Whales make clicks,whistles and pulsed calls"); 
    }

    @Override
    public void move() {
        System.out.println ("Whales swim");
    }

    @Override
    public void eat() {
        System.out.println ("Whales eat small fish like kelp");
    }

    @Override
    public void sleep() {
        System.out.println ("Whales sleep by resting half their brain at a time");
    }
    
}
