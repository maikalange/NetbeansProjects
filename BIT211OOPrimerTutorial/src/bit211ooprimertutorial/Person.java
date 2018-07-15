/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211ooprimertutorial;

/**
 *
 * @author MARCUS
 */
public class Person {
    //fields hold the state of this data object
    final String name;
    final String nrc;

    public Person(String name, String nrc){
        this.name  = name;
        this.nrc  = nrc;
    }
    
    public String getNrc(){
        return this.nrc;
    }
    
    public String getName(){
        return this.name;
    }

}
