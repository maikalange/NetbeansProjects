package bit211fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MARCUS
 */
public class DisplayFileContent {

    public static void main(String args[]) throws IOException, URISyntaxException {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(new URI("file:///C:/Users/randomnumbers.txt"))));
            while (reader.read() != -1) {
                System.out.println("Reading file..." + reader.readLine());
            }
        } catch (URISyntaxException | FileNotFoundException ex) {
            Logger.getLogger(DisplayFileContent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
