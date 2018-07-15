/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.co.nyirenda.app;

import java.util.logging.*;
import zm.co.nyirenda.domain.*;
import static zm.co.nyirenda.domain.Account.Type.*;
;

/**
 *
 * @author MARCUS
 */
public class PackageTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Account acc = AccountFactory.createInstance(Current);
            acc.deposit(230);
        } catch (AccountCreationException ex) {
            Logger.getLogger(PackageTutorial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
