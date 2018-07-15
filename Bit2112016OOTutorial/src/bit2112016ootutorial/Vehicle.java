/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit2112016ootutorial;

/**
 *
 * @author MARCUS
 */
public abstract class Vehicle {

    protected int numberOfWheels;
    protected int numberOfGears;
    protected int currentSpeed;
    protected int currentGear;
    protected boolean isEngineRunning;

    public Vehicle(int numberOfWheels, int numberOfGears, int currentSpeed, int currentGear, boolean isEngineRunning) {
    }
;
    public abstract void changeGear(int gearNumber);
    public abstract void stopEngine();
    public abstract void accelerate();
    public abstract void startEngine();
}
