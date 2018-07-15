
import Mammal2.Mammal2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class MainMammal {

    public static void main(String[] args) {
        //Mammal2 mammal2 = new Mammal2();
        Dog dog = new Dog();
        Goat goat = new Goat();
        Whale whale = new Whale();

        System.out.println("GOAT");
        goat.cry();
        goat.eat();
        goat.move();
        goat.sleep();
        System.out.println();
        System.out.println("DOG");
        dog.cry();
        dog.eat();
        dog.move();
        dog.sleep();

        System.out.println();
        System.out.println("Whale");
        whale.cry();
        whale.eat();
        whale.move();
        whale.sleep();

    }
}
