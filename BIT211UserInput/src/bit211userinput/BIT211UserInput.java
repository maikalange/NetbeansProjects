/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211userinput;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author MARCUS
 */
public class BIT211UserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date date =  new Date();

        double sum = 0;
        for (double i = 0; i < 10;) {
            i += 0.1;
            sum += sum + i;
        }

        String s = "abc";
        System.out.println(s.charAt(3));
        String original, reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to reverse");
        original = in.nextLine();

        int length = original.length();

        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        System.out.println("Reverse of entered string is: " + reverse);
    }

}
