/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211residentialatmapplicationtutorial;

import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MARCUS
 */
public class Bit211ResidentialAtmApplicationTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account rupiahAccount  = new CurrentAccount(1424124124, "Rupiah Banda");
        Account thandiwesAccount = new CurrentAccount(312312321, "Thandiwe Banda");
        
        double openingBalance = rupiahAccount.getBalance();
        //Perform transactions
        rupiahAccount.deposit(200.00);
        try {
            rupiahAccount.withdraw(30.00);
        } catch (InsufficientFundsException ex) {
            Logger.getLogger(Bit211ResidentialAtmApplicationTutorial.class.getName()).log(Level.SEVERE, null, ex);
        }
        rupiahAccount.transfer(thandiwesAccount,50.00);
        
        
        double closingBalance = rupiahAccount.getBalance();
        
        out.println(rupiahAccount);
        out.println(thandiwesAccount);
    }
    
}
