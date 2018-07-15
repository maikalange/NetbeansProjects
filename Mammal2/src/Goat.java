
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
public class Goat extends Mammal2 {
    @Override
    public void cry(){
        System.out.println("cry= cry when the grass is dry");
    }
     @Override
    public void move(){
        System.out.println("move= move to search for food");
    }
     @Override
    public void sleep(){
        System.out.println("Sleep= sleep when tired");
    }
     @Override
    public void eat(){
        System.out.println("eat= eat till sunset");
    }
    
}
