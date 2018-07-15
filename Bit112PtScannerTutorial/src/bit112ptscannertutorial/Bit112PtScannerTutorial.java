/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112ptscannertutorial;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author MARCUS
 */
public class Bit112PtScannerTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        nameCheck();
        numberCheck();
        printSummary();
    }
    private static int i = 0;

    private static void numberCheck() {
        Scanner myScanner = new Scanner(System.in);

        String color  = myScanner.next();
        
        while (i < 100) {
            System.out.println("Please enter a number greater than a 100");
            try{
            i = myScanner.nextInt();
            }catch(InputMismatchException e){
                
                System.out.println(" Please enter a valid number");
            }
        }
        myScanner.close();
    }
    private static String name = "";

    private static void nameCheck() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Please enter your name");
            name = sc.next();
        } while (name == "");
    }

    private static void printSummary() {
        System.out.println(" The user entered the name: " + name);
        System.out.println(" The user entered the number: " + i);
    }

}
