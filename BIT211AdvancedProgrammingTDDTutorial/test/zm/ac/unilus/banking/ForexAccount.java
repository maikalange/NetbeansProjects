/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus.banking;

/**
 *
 * @author MARCUS
 */
class ForexAccount extends Account {

    private double balance;
    private final String accountName;
    private final long accountNumber;
    public ForexAccount(String accountName, long accountNumber) {
        super(accountName,accountNumber);
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    @Override
    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }
    
}
