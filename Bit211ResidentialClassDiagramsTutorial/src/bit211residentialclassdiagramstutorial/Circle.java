/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211residentialclassdiagramstutorial;

/**
 *
 * @author MARCUS
 */
public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = radius * radius * Math.PI;
        return area;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;

    }
}
