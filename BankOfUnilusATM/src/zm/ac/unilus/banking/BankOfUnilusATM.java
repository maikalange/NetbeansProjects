/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus.banking;

import zm.ac.unilus.CurrentAccount;

/**
 *
 * @author MARCUS
 */
public class BankOfUnilusATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long accountNumber  = 235364565L;
        CurrentAccount ca = new CurrentAccount(accountNumber);
        
        ca.checkBalance();
        
        ca.deposit(1000);
        ca.withdraw(1000);
        
    }
    
}
