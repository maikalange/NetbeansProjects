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
public class Dog extends Mammal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void move() {
    }

    @Override
    public void eat() {
    }

    @Override
    public void sleep() {
    }
    @Override
    public String toString(){
        return name;
    }

}
