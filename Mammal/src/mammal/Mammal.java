/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mammal;

/**
 * I am very excited to have written my first Java program which can compile.
 *
 * @author Kings
 */
public class Mammal {
//I was even drinking some tea when declaring my superclass bellow, java is interesting languege.

    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        System.out.println();

        Dog dog = new Dog();
        Goat goat = new Goat();
        Whale whale = new Whale();

        mammal.eat();
        mammal.move();
        mammal.cry();
        dog.eat();
        dog.move();
        dog.cry();
        System.out.println();
        goat.eat();
        goat.move();
        goat.cry();
        whale.eat();
        whale.move();
        whale.cry();
        System.out.println("Mammals are worm blooded animals, feed their young ones on milk, give birth to live young ones");
    }

    private void eat() {
        System.out.println("goat eat grass and leaves, dogs eat both meat and greens, whale eat small fish");
    }

    private void move() {
        System.out.println(" except whale, mammals move on four limbs, whales swim in water");
    }

    private void cry() {
        System.out.println("goat cries mmeee mmeee, dog whow whow, whale I dont know, but all mammal make sound");

    }
}
