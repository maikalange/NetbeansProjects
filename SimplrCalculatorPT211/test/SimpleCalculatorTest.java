/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author MARCUS
 */
public class SimpleCalculatorTest {
    
    public SimpleCalculatorTest() {
    }
    
    @Test
    public void testDeposit(){
        int expectedBalance  = 2000;
        
        Account acc  = new ForexAccount();
        
        acc.deposit(1000);
        
        int actualBalance  = acc.getBalance();
        
        assertEquals(expectedBalance, actualBalance);
        
    }

    public void testClose(){
        Account acc  = new ForexAccount();
        acc.close();
        
        
        
    }
    
}
