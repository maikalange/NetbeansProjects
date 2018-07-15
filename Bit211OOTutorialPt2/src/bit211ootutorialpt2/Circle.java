/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211ootutorialpt2;

/**
 *
 * @author MARCUS
 */
class Circle {

    private double radius;
    private static  int numberOfCirclesCreated;

    Circle(double radius) {
        this.radius = radius;
        numberOfCirclesCreated = numberOfCirclesCreated + 1;
    }
    
    static int getNumberOfCirclesCreated(){
        return numberOfCirclesCreated;
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    double getPerimeter() {
        return Math.PI * radius * 2;
    }

    void setRadius(double radius) {
        //add code to change the radius
        this.radius = radius;
    }

}
