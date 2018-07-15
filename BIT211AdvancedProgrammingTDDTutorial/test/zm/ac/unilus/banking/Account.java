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
public abstract class Account {

    public Account(String accountName, long accountNumber) {
    }

    public abstract void deposit(int i);

    public abstract double getBalance();

}
