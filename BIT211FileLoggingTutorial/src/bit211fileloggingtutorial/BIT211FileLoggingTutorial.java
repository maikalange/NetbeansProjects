/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211fileloggingtutorial;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

/**
 *
 * @author MARCUS
 */
public class BIT211FileLoggingTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;

        try {

            // This block configure the logger with handler and formatter  
            fh = new FileHandler("C:\\MyLogFile.xml");
            logger.addHandler(fh);
            XMLFormatter formatter = new XMLFormatter();
            fh.setFormatter(formatter);

            // the following statement is used to log any messages  
            logger.finest("My first log");

        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
    }

}
