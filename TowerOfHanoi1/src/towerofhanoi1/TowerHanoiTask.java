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
public class TowerHanoiTask implements Runnable {

    private final int numberOfDiscs;
    private final char fromTower;
    private final char toTower;
    private final char auxTower;

    public TowerHanoiTask(int numberOfDiscs, char fromTower, char toTower, char auxTower) {
        this.numberOfDiscs = numberOfDiscs;
        this.fromTower = fromTower;
        this.toTower = toTower;
        this.auxTower = auxTower;
    }

    public void moveDisks(int n, char fromTower,
            char toTower, char auxTower) {
        if (n == 1) // Stopping condition
        {
            System.out.println("Move disk " + n + " from "
                    + fromTower + " to " + toTower);
        } else {
            moveDisks(n - 1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + n + " from "
                    + fromTower + " to " + toTower);
            moveDisks(n - 1, auxTower, toTower, fromTower);
        }
        
    }

    @Override
    public void run() {
        moveDisks(numberOfDiscs, fromTower, toTower, auxTower);
    }

}
