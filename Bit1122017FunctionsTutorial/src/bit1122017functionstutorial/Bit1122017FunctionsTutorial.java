/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit1122017functionstutorial;

/**
 *
 * @author MARCUS
 */
public class Bit1122017FunctionsTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calling functions in the calculator class
        for (int x = 0; x < 10; x++) {
            int y = Calculator.cubic(x);
            System.out.println(y);
        }
        double answer = linear(12);

    }

    public static double linear(int x) {
        return 2 * x + 8;
    }

}
