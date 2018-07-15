/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112stringtutorial;

/**
 *
 * @author MARCUS
 */
public class Bit112StringTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String name  = "John";
       String lastName  = "Banda";
       String space  = " ";
       
       System.out.println(name.toUpperCase());
       
       System.out.println(name.substring(1, 3));
       
       System.out.println(name.length());
       
       System.out.println(lastName + space + name);
    }
    
}
