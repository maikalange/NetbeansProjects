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
class Whale extends Mammal {
    //Whales are unique mammals, some time I was even wondering if they are mammals at all.
   public Whale(){
       super();
       
       System.out.println("A whale is a mammal that lives in water");
       System.out.println("A whale is actually fish");
   }
    void eat() {
      System.out.println("Whales eat small fish and some plantains under the oceans"); 
    }
    void move() {
      System.out.println("Whales swim fast in water and are dangerous,they have swimming fins"); 
    }
    void cry() {
     System.out.println("whales make unique sounds especially during mating,but the exact cry sound is not known");
     System.out.println("Whales are very big type of fish, but they are worm blooded");
     
    }
}
