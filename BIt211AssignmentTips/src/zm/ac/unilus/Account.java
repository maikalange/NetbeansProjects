/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

/**
 *
 * @author MARCUS
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MARCUS
 */
public abstract class Account {

    protected static Logger logger;

    public Account(Long accountNumber, String accountName) {
        logger = Logger.getLogger(this.getClass().getName());
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void transfer(double amount, Account destinationAccount);

    protected Logger getFormattedLogger(Class c) {

        try {
            // This block configure the logger with handler and formatter  
            Formatter formatter = new SimpleFormatter();

            FileHandler fh = new FileHandler("C:\\Atm" + c.getName() + ".xml");

            logger.addHandler(fh);
            fh.setFormatter(formatter);

        } catch (SecurityException | IOException e) {
            logger.severe(this.toString());
        }

        return logger;
    }

}
