/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus.bit211;

import java.math.BigDecimal;

/**
 *
 * @author MARCUS
 */
public abstract class Account {
    public final String name;
    
    public Account(long accountNumber, String accountName){
    name =accountName;
    }//constructor  method
    
    public abstract void deposit(BigDecimal amount);

    public abstract BigDecimal getBalance();  
}
