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
final class CurrentAccount extends Account {

    private final Long accountNumber;
    private final String accountName;
    private double balance;


    public CurrentAccount(Long accountNumber, String accountName) {
        super(accountNumber, accountName);
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = 2500;
        getFormattedLogger(this.getClass()).info(this.toString());
    }

    @Override
    public String toString() {
        return "Account name:" + accountName + " Account Number: "
                + accountNumber + " Balance:ZMW " + balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            getFormattedLogger(this.getClass()).info(this.toString());
        }

    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            getFormattedLogger(this.getClass()).info(this.toString());
        }

    }


    @Override
    public void transfer(double amount, Account destinationAccount) {
        withdraw(amount);
        if (destinationAccount != null) {
            destinationAccount.deposit(amount);
            getFormattedLogger(this.getClass()).info(this.toString());
        }
    }

}
