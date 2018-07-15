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
final class ForexAccount extends Account {

    private final long accountNumber;
    private final String accountName;
    private double balance;

    public ForexAccount(long accountNumber, String accountName) {
        super(accountNumber, accountName);
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = 2500;
        getFormattedLogger(this.getClass()).info(this.toString());
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
        getFormattedLogger(this.getClass()).info(this.toString());
    }

    @Override
    public String toString() {
        return "Account name:" + accountName + " Account Number: "
                + accountNumber + " Balance:ZMW " + balance;
    }

    @Override
    public void withdraw(double amount) {
        balance = balance - amount;
        getFormattedLogger(this.getClass()).info(this.toString());
    }

    @Override
    public void transfer(double amount, Account destinationAccount) {
        getFormattedLogger(this.getClass()).info(this.toString());
    }

}
