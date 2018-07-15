/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211ootutorialpt2;

/**
 *
 * @author MARCUS
 */
public abstract class Account {

    protected double balance;
    protected final long accountNumber;
    protected final String nrc;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withDraw(double amount) {
        balance = balance - amount;
    }

    public double checkBalance() {
        return balance;
    }

    public void transfer(Account beneficiaryAccount, double amount) {
        beneficiaryAccount.deposit(amount);
    }

    public Account(long accountNumber, String nrc) {
        this.accountNumber = accountNumber;
        this.nrc = nrc;

    }
}
