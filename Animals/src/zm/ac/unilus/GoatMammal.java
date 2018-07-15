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
public class GoatMammal extends Mammal {

    @Override
    public void cry() {
        System.out.println ("Goats bleat");
        
    }

    @Override
    public void move() {
        System.out.println ("Goats walk on all fours") ;
    }

    @Override
    public void eat() {
        System.out.println("Goats eat grass");
          }

    @Override
    public void sleep() {
        System.out.println ("Goats sleep in intervals through out the day");
    }
    
}
