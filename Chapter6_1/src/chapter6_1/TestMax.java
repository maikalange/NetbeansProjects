/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6_1;

/**
 *
 * @author MARCUS
 */
public class TestMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }

    private static int max(int num1, int num2) {

        int result;

        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }

}
