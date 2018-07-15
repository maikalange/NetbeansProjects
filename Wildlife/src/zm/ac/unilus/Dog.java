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
public class Dog extends Mammals {

    @Override
    public void move() {
        System.out.println("I have four paws which i use to move about.");
    }

    @Override
    public void eat() {
        System.out.println("My diet includes meat though human beings are turning me into a vegetarian");
    }

    @Override
    public void cry() {
        System.out.println("When i am in pain, i wail.And when i am angry i bark.");
    }

    @Override
    public void sleep() {
        System.out.println("I enjoy sleeping on sunny days.");
    }
    
    
}
