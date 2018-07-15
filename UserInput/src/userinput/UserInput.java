/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinput;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author MARCUS
 */
public class UserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int currentValue = 0;
        String sb;
        do {
            out.println("Please guess the correct number");
            sb = keyboard.next();

        } while (currentValue < 0);
    }

}
