
import Mammal2.Mammal2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Dog extends Mammal2{
    @Override
    public void cry(){
        System.out.println("Cry= cry when attacked");
    }
     @Override
    public void move(){
        System.out.println("Move= move to guard the house");
    }
     @Override
    public void sleep(){
        System.out.println("Sleep= sleep during day time");
    }
     @Override
    public void eat(){
        System.out.println("Eat= eat when master gives food");
    }
            
    
}
