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
public class AddPennyTask implements Runnable {

    private final Account account;

    public AddPennyTask(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        synchronized (account) {
            account.deposit(1);
        }
    }

}
