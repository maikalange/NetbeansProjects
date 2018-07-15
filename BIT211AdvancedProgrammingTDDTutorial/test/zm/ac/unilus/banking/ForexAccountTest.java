/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus.banking;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MARCUS
 */
public class ForexAccountTest {
    
    public ForexAccountTest() {
    }
    
    @Test
    public void testDeposit(){
        Account forexAcc = new ForexAccount("Joe Bloggs",567890899L);
        forexAcc.deposit(1500);
        
        double expectedBalance  = 1500;
        double actualBalance  = forexAcc.getBalance();
        
        assertEquals(expectedBalance, actualBalance,0.00001);
    }
    
}
