/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211objectserializationtutorial;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MARCUS
 */
public class BIT211ObjectSerializationTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        try (ObjectOutputStream output
                = new ObjectOutputStream(new FileOutputStream("c:\\dog.bin"))) {
            Dog d = new Dog("Micky", 10);
            d.setWeight(20.5);
            d.setOwner(new Person("Miles Davis", d));
            d.setBreeed("Labrador");
            d.setColor("Red");

            output.writeObject(d);

        }

    }

}
