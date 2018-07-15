/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112pttrafficcontroltutorial;

import java.util.Scanner;

/**
 *
 * @author MARCUS
 */
public class Bit112PtTrafficControlTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myScanner  = new Scanner(System.in);
        System.out.println("Please enter a color");
        String color = myScanner.next();
        if (color == "red") {
            System.out.println("Stop");
        } else if (color == "green") {
            System.out.println("Go!");
        } else if (color == "amber") {
            System.out.println("Get ready");
        }else{
            System.out.println("Proceed with caution");
        }
    }

}
