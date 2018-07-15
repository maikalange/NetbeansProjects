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
public class Employee extends Person {
    private String socialSecurityNumber;
    private String employeeId;
    private String title;
    public Employee(String name, String nrc) {
        super(name, nrc);
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
        
    public void setId(String id){
        this.employeeId = id;
    }
    
}
