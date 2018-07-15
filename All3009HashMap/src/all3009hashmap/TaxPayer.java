/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all3009hashmap;

/**
 *
 * @author MARCUS
 */
class TaxPayer {
    private double balance;
    private long tpin;
    private String name;

    TaxPayer(long tpin, String name) {
        this.name = name;
        this.balance = 1235D;
        this.tpin = tpin;
    }

    void makePayment(double amount) {
        balance = balance - amount;
    }

    @Override
    public String toString() {
        return name + " has made a payment. Current balance is: ZMW" + balance;
    }
}
