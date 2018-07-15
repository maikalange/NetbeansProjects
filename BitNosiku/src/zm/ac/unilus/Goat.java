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
public class Goat extends Mammal{
@Override
    public void title() {
        System.out.println("BEHAVIOUR OF GOATS");
    }
    
@Override
    public void cry() {
        System.out.println (" 1. The Goat started bleating when it was chased by dogs  ");
    }

    @Override
    public void move() {
          System.out.println (" 2. Goats have three legs on the ground as they move, and have hoovesj");
    }  

    @Override
    public void sleep() {
        System.out.println (" 3. The Goat rarely sleep as they seem to be eating all the time ");
    }

    @Override
    public void eat() {
        System.out.println (" 4. Goats are known to chew on anything including clothes, but healthy food is plant material ");
    }
    
}
