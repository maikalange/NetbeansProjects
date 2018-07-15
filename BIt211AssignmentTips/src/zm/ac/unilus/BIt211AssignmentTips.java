/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus;

import java.util.HashMap;

/**
 *
 * @author MARCUS
 */
public class BIt211AssignmentTips {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Long, Account> accounts = new HashMap<>();
        
        accounts.put(7078888889L, new ForexAccount(7078888889L, "Miles Davis"));
        accounts.put(7778888888L, new CurrentAccount(7778888888L, "Frank Sinatra"));
        
        Account accA = accounts.get(7078888889L);
        accA.deposit(200d);
        accA.withdraw(150d);
        
        Account accB = accounts.get(7778888888L);
        accA.transfer(200,accB);
        
    }

}
