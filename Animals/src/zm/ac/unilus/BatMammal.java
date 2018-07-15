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
public class BatMammal extends Mammal {

    @Override
    public void cry() {
        System.out.println ("Bats produce sonic signals");
    }

    @Override
    public void move() {
        System.out.println ("Bats fly");
    }

    @Override
    public void eat() {
        System.out.println ("Bats eat certain fruit and suck blood");
    }

    @Override
    public void sleep() {
        System.out.println ("Bats sleep upside down in caves or tree branches");
    }
    
}
