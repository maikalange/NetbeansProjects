/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerofhanoi1;

/**
 *
 * @author MARCUS
 */
class CounterTask implements Runnable {
private int i;
    public CounterTask(int i) {
        this.i= i;
    }

    @Override
    public void run() {
        for (int j = 0; j < i; j++) {
            System.out.println(j);
        }
    }
    
}
