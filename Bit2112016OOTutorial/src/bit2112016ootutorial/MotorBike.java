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
public class MotorBike extends Vehicle {

    public MotorBike(int numberOfWheels, int numberOfGears, int currentSpeed, int currentGear, boolean isEngineRunning) {
        super(numberOfWheels, numberOfGears, currentSpeed, currentGear, isEngineRunning);
        this.numberOfWheels = numberOfWheels;
        this.numberOfGears = numberOfGears;
        this.currentSpeed = currentSpeed;
        this.currentGear = currentGear;
        this.isEngineRunning = isEngineRunning;
    }

    @Override
    public void changeGear(int gearNumber) {
        if (this.isEngineRunning && this.currentSpeed > 0) {
            this.currentGear = this.currentGear + 1;
            System.out.println("The current gear is: " + this.currentGear);
        }
    }

    @Override
    public void stopEngine() {
        if (this.currentSpeed == 0) {
            this.isEngineRunning = false;
            System.out.println("Engine is stopped");
        }
    }

    @Override
    public void accelerate() {
        if (this.isEngineRunning && this.currentGear > 0) {
            this.currentSpeed = (this.currentSpeed + 5);
            System.out.println("The current speed is:" + currentSpeed + "Km/hour");
        } else {
            System.out.println("Unable to accelerate the vehicle because engine is not running: ");
        }

    }

    @Override
    public void startEngine() {
        if (!this.isEngineRunning) {
            this.isEngineRunning = true;
            System.out.println("Engine has started");
        } else {
            System.out.println("Engine already started");
        }
    }
}
