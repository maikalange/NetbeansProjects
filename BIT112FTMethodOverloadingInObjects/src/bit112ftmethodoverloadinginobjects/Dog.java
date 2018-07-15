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
class Dog {
private final String name;
private final int NUMBER_OF_STEPS = 10;
private int location;
    Dog(String name) {
         this.name  = name;
    }

    void move(int numberOfSteps) {
        location  = location +numberOfSteps;
        System.out.println(name + " moved " + numberOfSteps +" steps");
    }

    void move() {
        location  = location + NUMBER_OF_STEPS;
         System.out.println(name + " moved " + NUMBER_OF_STEPS +" steps");
    }
    
    int getCurrentLocation(){
        return location;
    }
    
}
