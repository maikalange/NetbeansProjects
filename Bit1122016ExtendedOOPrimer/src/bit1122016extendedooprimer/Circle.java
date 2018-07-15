/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit1122016extendedooprimer;

/**
 *
 * @author MARCUS
 */
class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double area() {
       return Math.PI* radius*radius;
    }

    double perimeter() {
        return 2*Math.PI*radius;
    }
    
}
