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
public class Whale extends Mammals{

    @Override
    public void move() {
        System.out.println("I have big fins and a tail which i use to swim");
    }

    @Override
    public void eat() {
        System.out.println("I feed on aqautic life forms.");
    }

    @Override
    public void cry() {
        System.out.println("I produce a wailing sound which i use to communicate to my fellow whales.");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep in the water because that is were my home is and that is were i live.");
    }
    
}
