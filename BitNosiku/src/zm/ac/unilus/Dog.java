/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus;

/**
 *
 * @author Nosiku
 */
public  class Dog extends Mammal{
   @Override
    public void title() {
        System.out.println("BEHAVIOUR OF DOGS");
    }
    @Override
    public void cry() {
        System.out.println (" 1.  The dog started whining when it saw its owner ");
    }

    @Override
    public void move() {
          System.out.println (" 2. The Dog moves with three legs on the ground at a time ");
    }  

    @Override
    public void sleep() {
        System.out.println (" 3. Dogs sleep most when kept indoors than outdoors ");
    }

    @Override
    public void eat() {
        System.out.println (" 4. Dogs eat just about anything there come across ");
    }

    
}
