/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.co.nyirenda.domain;

import zm.co.nyirenda.domain.Account.Type;

/**
 *
 * @author MARCUS
 */
public class AccountFactory {

    public static Account createInstance(Type type) throws AccountCreationException {
        switch (type) {
            case Current:
                return new CurrentAccount(233467);
            case Forex:
                return ForexAccount.create(233467);
            default:
                throw new AccountCreationException("Invalid account type specified");
        }
    }

}
