/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.co.nyirenda.domain;

/**
 *
 * @author MARCUS
 */
public class CurrentAccount extends Account {

    private final int id;
    private double balance;

    protected CurrentAccount(int id) {
        super(id);
        this.id = id;

    }


    @Override
    protected void withdraw(double amount) {
        if (amount > balance) {
            balance -= amount;
        }
        logTransaction();
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        logTransaction();
    }
}
