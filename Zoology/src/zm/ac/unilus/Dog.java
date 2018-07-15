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
public class Dog extends Mammal{
   
    @Override
    public void move() {
         System.out.println("Dogs can walk");
    }

    @Override
    public void Sleep() {
        System.out.println("Dogs sleep during the day");
    }

    @Override
    public void cry() {
        System.out.println("Dogs bark");
    }

    @Override
    public void eat() {
        System.out.println("Dogs are carnivores");
    }
    
}
