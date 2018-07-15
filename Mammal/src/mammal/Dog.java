/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mammal;

/**
 *
 * @author Kings
 */
public class Dog extends Mammal {
   public Dog(){
       super();
       System.out.println("A dog is a friend of man");   
    }
    void eat() {
System.out.println("Dogs eat almost anything, they are Omnivorous");
        System.out.println("Like all mammals dogs are also worm blooded");
    }
    void move() {
System.out.println("Dogs walk fast and smell strongly");        
    }
    void cry() {
       System.out.println("Dogs screams, but burking helps in security"); }
    
}