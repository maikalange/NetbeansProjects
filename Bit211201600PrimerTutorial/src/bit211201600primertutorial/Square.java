/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211201600primertutorial;

/**
 *
 * @author MARCUS
 */
public class Square {

    private double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    /**
     * This method calculates the area of the square
     *
     * @return
     */
    public double area() {
        return sideA * sideA;
    }

    /**
     * This method calculates the perimeter of the square
     *
     * @return
     */
    public double perimeter() {
        return 4 * sideA;
    }

    /**
     * Mutator to change the length of a square
     *
     * @param sideA
     */
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

}
