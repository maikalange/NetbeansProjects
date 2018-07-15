/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211ftcollections;

import java.util.HashMap;

/**
 *
 * @author MARCUS
 */
public class BIT211FTCollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Keys must be objects and instantiate the collection
        HashMap<Long,Account> accounts = new HashMap();

        //populate the collection
        accounts.put(34567890L, new Account((34567890L), "John Smith"));
        accounts.put(2234567890L, new Account((2234567890L), "Mary Smith"));
        
        //Display entries in the collection
        for(Account account: accounts.values()){
            System.out.println(account.details());
        }
        
        //This is how to get a single value by key
        Account acc  = accounts.get(2234567890L);
        System.out.println("----------------------------------");
        System.out.println(acc.details());
    }

    static class Account {
        long accountNumber;
        String accountName;
        Account(long accountNumber, String accountName) {
            this.accountName = accountName;
            this.accountNumber = accountNumber;
        }
        
        String details(){
            return accountName + " " + accountNumber;
        }
    }
}
