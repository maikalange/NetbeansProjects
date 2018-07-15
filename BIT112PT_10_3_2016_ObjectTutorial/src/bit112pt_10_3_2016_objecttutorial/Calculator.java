/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112pt_10_3_2016_objecttutorial;

/**
 *
 * @author MARCUS
 */
class Calculator {

    private double j;
    private double k;

    Calculator(double x, double y) {
        j = x;
        k = y;
    }

    double divide() {
        return j / k;
    }

    double multiply() {
        return j * k;
    }

    double subtract() {
        return k - j;
    }

    double add(double d, double d0) {
        return d + d0;
    }

    double add() {
        return j + k;
    }

}
