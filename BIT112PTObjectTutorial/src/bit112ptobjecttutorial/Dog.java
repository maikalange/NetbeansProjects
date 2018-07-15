/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112ptobjecttutorial;

/**
 *
 * @author MARCUS
 */
class Dog {
    private final String name, color;
    private int age, location;
    private double weight;
    private boolean isQuiet = true;

    //This is a constructor method
    Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    void move(int numberOfSteps) {
        location = location + numberOfSteps;
        System.out.println(name + " moved " + numberOfSteps + " steps" + " ."+ name+" is now " + location+ " steps from the origin");
    }

    void bark() {
        isQuiet = false;
        System.out.println("Woof! woof! Strangers in the yard");
    }

}
