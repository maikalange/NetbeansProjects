/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.math.BigDecimal;
import org.junit.Test;
import static org.junit.Assert.*;
import zm.ac.unilus.bit211.Account;
import zm.ac.unilus.bit211.ForexAccount;

/**
 *
 * @author MARCUS
 */
public class ForexAccountTest {

    public ForexAccountTest() {
    }

    @Test
    
    public void testDeposit() {

        Account account = new ForexAccount(412412412L, "Patricia Ndume");
        account.deposit(BigDecimal.valueOf(1500.45));
        
        BigDecimal expectedBalance = BigDecimal.valueOf(4000.05);

        BigDecimal actualBalance = account.getBalance();
        assertEquals(expectedBalance, actualBalance);
    }

}
