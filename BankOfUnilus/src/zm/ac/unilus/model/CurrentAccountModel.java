/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus.model;

import java.util.HashMap;
import zm.ac.unilus.Account;
import zm.ac.unilus.CurrentAccount;

/**
 *
 * @author MARCUS
 */
public final class CurrentAccountModel {

    private static HashMap<Long, Account> accounts = new HashMap<>();

    private CurrentAccountModel() {

    }

    public static void initialise() {
        Account john = new CurrentAccount(9244631);
        Account jack = new CurrentAccount(9244632);
        Account james = new CurrentAccount(9244633);

        accounts.put(new Long(9244632), jack);
        accounts.put(new Long(9244633), james);
        accounts.put(new Long(9244631), john);
    }

    public static Account findByAccNo(Long accountNumber) {
        return accounts.get(accountNumber);
    }

}
