/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus;

/**
 *
 * @author MARCUS
 *
 */
public abstract class Account {

    /**
     * Checks balance for a given account
     */
    public abstract void checkBalance();

    /**
     * Deposits amount to account
     *
     * @param amount
     */
    public abstract void deposit(double amount);

    /**
     *
     * @param amount
     */
    public abstract void withdraw(double amount);

    public Account(long accountNumber) {
    }
;
}
