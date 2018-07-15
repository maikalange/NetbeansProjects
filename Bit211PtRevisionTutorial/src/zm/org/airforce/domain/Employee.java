/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.org.airforce.domain;

/**
 *
 * @author MARCUS
 */
public class Employee {
    private  String name;
    private int id;
    private static String department;
  
    
    public Employee(){

    }
    public Employee(String name){

        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    
    public static String getDepartment(){
        return department;
    }
    
}
