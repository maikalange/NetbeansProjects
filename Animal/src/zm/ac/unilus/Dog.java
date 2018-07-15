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
public class Dog extends Mammal {

    @Override
    public void cry() {
        System.out.println("it barks when it senses something strange");
    }

    @Override
    public void move() {
        System.out.println("it moves about searching for food");
    }

    @Override
    public void sleep() {
        System.out.println("it sleeps less hours during the day and night");
    }

    @Override
    public void eat() {
        System.out.println("it eats meat and bones");
    }
    
}
