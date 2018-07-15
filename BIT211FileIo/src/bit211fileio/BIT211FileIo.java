/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author MARCUS
 */
public class BIT211FileIo {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws java.net.URISyntaxException
     */
    public static void main(String[] args) throws IOException, URISyntaxException {
        //Creating a file writer object that takes in a file object

        File f = new File(new URI("file:///C:/Users/randomnumbers.txt"));

        try (FileWriter writer = new FileWriter(f)) {
            for (int i = 0; i < 500; i++) {
                writer.write(Integer.toString((int) (100 * Math.random())));
            }

        }
    }

}
