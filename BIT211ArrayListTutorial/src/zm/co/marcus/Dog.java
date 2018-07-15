/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.co.marcus;

/**
 *
 * @author MARCUS
 */
class Dog {

    private final String name;
    private final int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void wagTail() {
        System.out.println("I am " + name + " and I am wagging my tail " + " my age is " + age);
    }

}
