/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.bit112;

/**
 *
 * @author K . Mwamba
 */
public class ASSIGNMENTBIT112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("Fwizzbizz");

            } else if (i % 2 == 0) {
                System.out.println("Fwizz");

            } else if (i % 5 == 0) {
                System.out.println("Bwizz");

            } else {
                System.out.println(i);
            }

            // TODO code application logic here
        }
    }

}
