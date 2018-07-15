/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211hashmaptutorial;

/**
 *
 * @author MARCUS
 */
class Dog {

    private final String name;
    public Dog(String name) {
        this.name = name;
    }
    
    
    @Override
    public String toString(){
        return name;
    }

    void wagTail() {
        System.out.println("Tail wagged by: " + name);
    }
}
