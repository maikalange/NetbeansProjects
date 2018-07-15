/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211residentialatmapplicationtutorial;

/**
 *
 * @author MARCUS
 */
public abstract class Account {

    public abstract double getBalance();

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount)throws InsufficientFundsException ;

    public abstract void transfer(Account thandiwesAccount, double amount);
    
    public Account(int accountNumber, String name){}

}
