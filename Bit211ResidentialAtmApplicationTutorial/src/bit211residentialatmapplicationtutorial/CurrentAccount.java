/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211residentialatmapplicationtutorial;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MARCUS
 */
public class CurrentAccount extends Account {

    private String name;
    private double balance = 250;
    private int accountNumber;

    public CurrentAccount(int accountNumber, String name) {
        super(accountNumber, name);
        this.accountNumber = accountNumber;
        this.name = name;
    }

    @Override
    public double getBalance() {
         Logger.getLogger(CurrentAccount.class.getName()).log(Level.INFO,"getBalance");
        return this.balance;
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
        Logger.getLogger(CurrentAccount.class.getName()).log(Level.INFO, "deposit");
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds availlable. Please contact your branch");
        }
        balance = balance - amount;
        Logger.getLogger(CurrentAccount.class.getName()).log(Level.INFO, "withdraw");
    }

    @Override
    public void transfer(Account beneficiaryAccount, double amount) {
        try {
            withdraw(amount);
            beneficiaryAccount.deposit(amount);
        } catch (InsufficientFundsException ex) {
            Logger.getLogger(CurrentAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
             Logger.getLogger(CurrentAccount.class.getName()).log(Level.INFO,"transfer");
        }

    }

    @Override
    public String toString() {
        return " The balance for account " + accountNumber + " is:  ZMW" + balance + " .Thank you for banking with us.";
    }

}
