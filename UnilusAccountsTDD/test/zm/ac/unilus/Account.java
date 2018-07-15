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
public abstract class  Account {

    public Account(long accountNumber, String accountName){}
    public abstract void  deposit(double i) ;

    public abstract double getBalance();
    
}
