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
public class Bit211PtRevisionTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee tom  = new Employee("tom");
        tom.getName();//calling an instance method

        Employee.getDepartment();//class method or static method
        
        Employee[] zafEmployees = new Employee[1000];
        int[] scores  = new int[100];
        
        for (int i = 0; i < zafEmployees.length; i++) {
            zafEmployees[i] = new Employee("JohnBanda" + i);

        }
    }
    
}
