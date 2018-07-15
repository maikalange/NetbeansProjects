/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all2909datastructures;

/**
 *
 * @author MARCUS
 */
class Dog {

    private final String name;

    Dog(String name) {
        this.name = name;
    }

    void wagTail() {
        System.out.println("I am " + name +". I am happy!");
    }
}
