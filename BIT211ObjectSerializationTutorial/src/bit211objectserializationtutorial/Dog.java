/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211objectserializationtutorial;

import java.io.Serializable;

/**
 *
 * @author MARCUS
 */
class Dog implements Serializable {

    private final String name;
    private int location;
    private int numberOfSteps;
    private double weight;
    private String breed;
    private Person owner;
    private String color;

    public Dog(String name,int numberOfSteps) {
        this.name = name;
        this.numberOfSteps = numberOfSteps;
        move(numberOfSteps);
    }

    void wagTail() {
        System.out.println("Wagging my tail " + name);
    }

    void move(int numberOfSteps) {
        location = location + numberOfSteps;
    }
    
    int getLocation(){
        return location;
    }

    @Override
    public String toString(){
        return name + " location:" + location + 
                " number of steps moved:" + numberOfSteps + 
                " Color:" +  color + " Owner:" + owner +
                " Weight: " + weight;
    }

    void setWeight(double d) {
        this.weight = d;
    }

    void setOwner(Person owner) {
        this.owner=owner;
    }

    void setBreeed(String breed) {
        this.breed = breed;
    }

    void setColor(String color) {
        this.color = color;
    }

    Person getOwner() {
        return owner;
    }

    String getColor() {
        return color;
    }

    String getBreed() {
        return breed;
    }

    double getWeight() {
        return weight;
    }
}
