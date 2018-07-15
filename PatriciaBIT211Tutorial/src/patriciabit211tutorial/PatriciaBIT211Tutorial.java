/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patriciabit211tutorial;

import java.math.BigDecimal;
import zm.ac.unilus.bit211.Account;
import zm.ac.unilus.bit211.ForexAccount;

/**
 *
 * @author MARCUS
 */
public class PatriciaBIT211Tutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Account account  = new ForexAccount(41234124124L,"Patricia Ndume");
        account.deposit(BigDecimal.valueOf(1500));
        
    }
    
}
