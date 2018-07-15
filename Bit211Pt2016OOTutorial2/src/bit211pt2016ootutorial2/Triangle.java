/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211pt2016ootutorial2;

/**
 *
 * @author MARCUS
 */
public class Triangle extends GeometricObject {

    public Triangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public double perimeter() {
        return this.sideA + this.sideB + this.sideC;
    }
    
    private double getSemiPerimeter(){
        return perimeter()/2;
    }

    @Override
    public double area() {
        return Math.sqrt(getSemiPerimeter()*(getSemiPerimeter() 
                -this.sideA)*(getSemiPerimeter() 
                -this.sideB)*(getSemiPerimeter() -this.sideC));
    }

    @Override
    public String color() {
        return this.color;
    }

    @Override
    public boolean isFilled() {
        return this.isFilled;
    }

    @Override
    public void setIsFilled(boolean isFilled) {
       this.isFilled = isFilled;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
