/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus.residential;

/**
 *
 * @author MARCUS
 */
public class Square extends Rectangle {

    public Square(double sideB, double sideA) {
        super(sideB, sideA);
        if (sideA != sideB) {
            throw new IllegalArgumentException("Invalid dimensions for the square. Sides must be equal");
        }
    }
}
