/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus;

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
        Account fxAccount  = new ForexAccount(23456789L,"Joe Bloggs");
        fxAccount.deposit(1500);
        
        double expectedBalance = 1500;
        
        double actualBalance  = fxAccount.getBalance();
        
        assertEquals(expectedBalance, actualBalance, 0.0000001);
        
    }
    
}
