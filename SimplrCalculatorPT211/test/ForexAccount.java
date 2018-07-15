/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARCUS
 */
class ForexAccount extends Account {

    private int balance = 1000;
    private boolean isClosed = false;

    public ForexAccount() {
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(int i) {
        this.balance = this.balance + i;
    }

}
