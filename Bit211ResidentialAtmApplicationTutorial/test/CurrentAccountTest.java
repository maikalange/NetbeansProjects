/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bit211residentialatmapplicationtutorial.Account;
import bit211residentialatmapplicationtutorial.CurrentAccount;
import bit211residentialatmapplicationtutorial.InsufficientFundsException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MARCUS
 */
public class CurrentAccountTest {

    public CurrentAccountTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testDeposit() {
        Account account = new CurrentAccount(312313, "Marcus");
        double expectedBalance = 370;
        account.deposit(120);
        double actualBalance = account.getBalance();
        assertEquals(expectedBalance, actualBalance, 0.0000005);
    }

    @Test(expected = InsufficientFundsException.class)
    public void testWithdraw() throws InsufficientFundsException {
        Account account = new CurrentAccount(312313, "Marcus");
        double expectedBalance = 130;
        account.withdraw(100.00);
        double actualBalance = account.getBalance();
        assertEquals(expectedBalance, actualBalance, 0.0000005);
    }
}
