/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211ooprimertutorial;

import java.util.HashMap;

/**
 *
 * @author MARCUS
 */
public class BIT211OOPrimerTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person student  = new Student("Henry", "493977/11/1");
        System.out.println(student.getNrc());
        
        Person employee  = new Employee("Harry", "457958/11/1");
        System.out.println(employee.getNrc());

    }

}
