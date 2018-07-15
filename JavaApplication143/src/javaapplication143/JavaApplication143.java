/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication143;

/**
 *
 * @author MARCUS
 */
public class JavaApplication143 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean hasVotersCard = true;
        boolean hasGreenNRC = false;
        if (hasGreenNRC && hasVotersCard) {
            System.out.println("Yes you can vote. Proceed");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }

}
