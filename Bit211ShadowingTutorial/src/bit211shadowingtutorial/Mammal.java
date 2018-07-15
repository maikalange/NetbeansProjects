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
public abstract class Mammal {

    protected String name;

    public abstract void move();

    public abstract void eat();

    public abstract void sleep();

    public Mammal() {
    }

    
    public Mammal(String name) {
        this.name = name;
    }
}
