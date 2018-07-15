/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112ftmethodoverloadinginobjects;

/**
 *
 * @author MARCUS
 */
public class BIT112FTMethodOverloadingInObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Dog dog = new Dog("Poppy");

        //Overloaded move method on the dog
        dog.move(25);
        dog.move(-10);
        dog.move(5);
        System.out.println("location is: " + dog.getCurrentLocation());
        
        dog.move();
        System.out.println("location is: " + dog.getCurrentLocation());
    }

}
