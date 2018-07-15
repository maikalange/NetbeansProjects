/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112ftobjectprimertutorial;

/**
 *
 * @author MARCUS
 */
class Cat {
    private final String name;
    private final int age;
    private final String color;
    private String owner;
    private int location;
    private boolean isAwake;
    
    
    public Cat(String name, int age, String color){
        this.name  = name;
        this.age  = age;
        this.color = color;
        
    }

    void move(int i) {
        isAwake = true;
        int numberOfSteps = (int)(i* Math.random());
        location  = location + numberOfSteps;
        
        System.out.println(name  + " moved " + numberOfSteps + " from the origin");
        
    }

    void play() {
        isAwake  = true;
        System.out.println(name +  " is playing with a ball of string.");
    }

    void sleep() {
       System.out.println(name +  " is sleeping. Very tired");
       isAwake  = false;
    }
    
    boolean IsAwake(){
        return isAwake;
    }
    
}
