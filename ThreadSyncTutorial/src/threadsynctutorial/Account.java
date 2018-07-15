/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsynctutorial;

/**
 *
 * @author MARCUS
 */
public class Account {

    private int balance = 0;

    public void  deposit(int amount) {
    
        balance = balance+amount;
    }

    public int getBalance() {
        return balance;
    }
}
