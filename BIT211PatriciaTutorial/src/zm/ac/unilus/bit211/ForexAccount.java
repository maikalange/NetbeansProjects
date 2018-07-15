/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus.bit211;

import java.math.BigDecimal;

/**
 *
 * @author MARCUS
 */
public class ForexAccount extends Account {

    private BigDecimal balance;
    private final String name;
    private final long accountNumber;

    public ForexAccount(long accountNumber, String accountName) {
        super(accountNumber, accountName);
        this.balance = BigDecimal.valueOf(2500);

        this.accountNumber = accountNumber;
        this.name = accountName;
    }

    @Override
    public void deposit(BigDecimal amount) {
        this.balance = amount.add(balance);
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }

}
