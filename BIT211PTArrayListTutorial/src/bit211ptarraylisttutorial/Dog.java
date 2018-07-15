/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211ptarraylisttutorial;

/**
 *
 * @author MARCUS
 */
class Dog {

    //field declaration to hold the dog's name
    private final String name;

    Dog(String name) {
        this.name = name;
    }

    void wagTail() {
        System.out.println(name + " is wagging her tail. It's dinner time");
    }

}
