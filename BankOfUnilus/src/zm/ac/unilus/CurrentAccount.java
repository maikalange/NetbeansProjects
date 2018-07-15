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

    public CurrentAccount(long accountNumber) {
        
    }

    @Override
    public double checkBalance() {
        System.out.println("The current balance is K5,000.00");
        return 0;
    }

    @Override
    public void deposit() {
        System.out.println(" Deposited some cash");
    }

    @Override
    public void withdraw() {
        System.out.println(" Withdraw some cash");
    }

    @Override
    public void transfer() {
        System.out.println(" Transfer some cash");
    }

}
