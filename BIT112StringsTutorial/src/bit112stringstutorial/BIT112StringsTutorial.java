/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112stringstutorial;

/**
 *
 * @author MARCUS
 */
public class BIT112StringsTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String firstName = "Rupiah ";
        String lastName = "Banda";
        
        String message = "::Vote wisely::";
        
        String number = "2525435234234234";

        long result  = new Long(number);
        long result2  = Long.decode(number);

        
        System.out.println(result2);
        System.out.println(message.toLowerCase()+firstName.toUpperCase() + lastName.toUpperCase() );
    }

}
