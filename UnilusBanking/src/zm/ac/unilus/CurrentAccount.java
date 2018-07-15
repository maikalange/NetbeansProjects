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
public class CurrentAccount extends Account {

    private double balance = 5000;

    public CurrentAccount(long accountNumber) {
        super(accountNumber);
    }

    @Override
    public void checkBalance() {
        System.out.println(" The current balance is K" + balance);
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("K" + amount + " was deposited. The current balance is: K" + balance);
        
        //Go to database and save amount 
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds available. Please try a different amount");
        } else {
            balance = balance - amount;
            System.out.println("K" + amount + " was withdrawn. The current balance is:" + balance);
        }
    }

}
