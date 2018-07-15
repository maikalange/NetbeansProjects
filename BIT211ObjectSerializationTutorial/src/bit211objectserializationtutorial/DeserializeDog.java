/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211objectserializationtutorial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MARCUS
 */
public class DeserializeDog {

    public static void main(String[] args) throws IOException {
        
        try (ObjectInputStream input = 
                new ObjectInputStream(new FileInputStream("c:\\dog.dat"))) {
            try {
                Dog d = (Dog) input.readObject();

                System.out.println(d);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BIT211ObjectSerializationTutorial.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
