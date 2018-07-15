/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus;

/**
 *
 * @author MARCUS
 */
public class ForexAccount extends Account {

    private double balance;
    private final long accountNumber;
    private final String accountName;

    public ForexAccount(long accountNumber, String accountName) {
        super(accountNumber, accountName);
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    @Override
    public void deposit(double amount) {

        balance = balance + amount;
    }

    @Override
    public double getBalance() {

        return balance;
    }

}
