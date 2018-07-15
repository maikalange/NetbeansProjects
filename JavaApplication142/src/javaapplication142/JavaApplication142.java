/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication142;

/**
 *
 * @author MARCUS
 */
public class JavaApplication142 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String color = "AMBER";
        if (color == "GREEN") {
            System.out.println("GO!");
        } else if (color == "RED") {
            System.out.println("STOP!");
        } else if (color == "AMBER") {
            System.out.println("GET READY!");
        } else {
            System.out.println("Lights not working. Proceed with Caution!");
        }
    }

}
