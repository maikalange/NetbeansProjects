/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus;

/**
 *
 * @author Nosiku
 */
public  class Whale extends Mammal{
    @Override
    public void title() {
        System.out.println("BEHAVIOUR OF WHALEC VBNS");
    }   
    @Override
    public void cry() {
        System.out.println (" 1. Whale makes a loud crying sound to communicate with each other ");
    }

    @Override
    public void move() {
          System.out.println (" 2. Whales flap their fins and tails in order to swim in water ");
    }  

    @Override
    public void sleep() {
        System.out.println (" 3. Whales sleep under water since their are voluntary breathers ");
    }

    @Override
    public void eat() {
        System.out.println (" 4. Whales eat fish and other prey larger than themselves ");
    }
}
