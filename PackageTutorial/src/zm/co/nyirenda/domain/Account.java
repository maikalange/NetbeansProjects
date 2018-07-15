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
public abstract class Account {

    public Account(int id) {
        super();
    }

    public static enum Type {

        Current, Forex, Savings

    }

    public abstract void deposit(double amount);

    protected abstract void withdraw(double amount);

    protected void logTransaction() {

    }

}
