/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit1122016methodsandstringtutorial;

/**
 *
 * @author MARCUS
 */
public class Calculator {
    private double j;
    private double k;
    
    
    public Calculator(double x, double y){
        j=x;
        k=y;
    }
    
    public double add(){
        return j+k;
    }
    public double subtract(){
        return k-j;
    }
    public static double add(int j, int k) {
        return j + k;
    }

}
