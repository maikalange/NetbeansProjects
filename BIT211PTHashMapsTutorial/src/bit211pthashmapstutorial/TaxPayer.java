/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211pthashmapstutorial;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MARCUS
 */
class TaxPayer {
    private final String name;
    private final Long tpin;
    private double balance;
     private static final Logger logger =
        Logger.getLogger(TaxPayer.class.getName());
    public TaxPayer(Long tpin, String name){
        this.balance = 1000D;
        this.name  =name;
        this.tpin = tpin;
    }
    
    public void makePayment(double amount){
        balance = balance - amount;
        logger.log(Level.INFO, this.toString());
    }
    
    public double getBalance(){
        return balance;
    }
    
    @Override
    public String toString(){
    return "Balance: K"  + balance + " for " + name + " TPIN is " +tpin;
    }
}
