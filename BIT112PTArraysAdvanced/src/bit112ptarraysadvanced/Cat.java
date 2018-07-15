/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112ptarraysadvanced;

/**
 *
 * @author MARCUS
 */
class Cat {
    private final String name;
    private final int age;

    Cat(String name, int age) {
        this.name  = name;
        this.age  = age;
        
    }
    
    public void pur(){
        System.out.println("Purrrrrr....." + name);
    }
    
}
