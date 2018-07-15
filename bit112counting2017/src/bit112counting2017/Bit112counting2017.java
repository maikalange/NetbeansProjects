/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112counting2017;

/**
 *
 * @author MARCUS
 */
public class Bit112counting2017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int addResult = 23 + 12;
        System.out.println(addResult);

        int subtractResult = 23 - 90;
        System.out.println(subtractResult);

        int multiplyResult = 23 * 67;
        System.out.println(multiplyResult);

        double divideResult = 25d / 12;
        System.out.println(divideResult);

        for (int x = 1; x <= 100; x = x + 1) {
            int modulusResult = x % 2;
            
            if (modulusResult == 0) {
                System.out.println(x);
            }

        }

    }
}
