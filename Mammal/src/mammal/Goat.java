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
public class Goat extends Mammal {
     public Goat(){
       super();
       System.out.println("Goats are small beefy domesticated mammals");
       System .out.println("A goat is a four limbed mammal");
     }
    void eat() {
       System.out.println("Goats are herbivorous, they eat grass and leaves"); 
    }
    void move() {
      System.out.println("Goats move in heards, they are grazing mammals");  
    }
    void cry() {
     System.out.println("Goats cry their 'mheee  mheee sound' loudly");
    }
      
}
