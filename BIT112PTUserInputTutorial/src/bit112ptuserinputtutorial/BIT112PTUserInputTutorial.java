/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112ptuserinputtutorial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MARCUS
 */
public class BIT112PTUserInputTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String message;
        do {
            System.out.println("Please enter a message");
            message = sc.nextLine();

            System.out.print(message.toUpperCase());
            System.out.println();
        } while (!"".equals(message));

        try {
            createFile();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BIT112PTUserInputTutorial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void createFile() throws FileNotFoundException {
        File f = new File("c:\\bit112.txt");

        try (PrintWriter pw = new PrintWriter(f)) {
            pw.print("Hello BIT112 \n. Java rocks and we are loving it!\n We are going to create some great apps");
        }
        System.out.println("File Created...");

        StringBuilder content = new StringBuilder();
        try (Scanner sc = new Scanner(f)) {

            while (sc.hasNextLine()) {
                content.append(sc.nextLine());
            }
        }
        System.out.println(content);
        System.out.println(f.getPath());
        System.out.println(f.length());
    }
}
