/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211shadowingtutorial;

/**
 *
 * @author MARCUS
 */
public class Cow extends Mammal {

    @Override
    public void move() {
       System.out.println("I move slowly on 4 legs");
    }

    @Override
    public void eat() {
       System.out.println("I eat grass and hay");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep on four legs");
    }
    
}
