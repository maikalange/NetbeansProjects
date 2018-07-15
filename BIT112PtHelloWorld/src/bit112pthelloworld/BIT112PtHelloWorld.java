/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112pthelloworld;

/**
 *
 * @author MARCUS
 */
public class BIT112PtHelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int result = 1 - 6;

        int test = 5;

        int addResult = 5 + 8;

        System.out.println(addResult);

        int multiplyResult = 5 * 6;
        System.out.println(multiplyResult);

        int divideResult = 12 / 6;
        System.out.println(divideResult);

        int subtractResult = 8 - 1;
        System.out.println("Subtract result is " + subtractResult);

        int remainderResult = 4 % 2;
        System.out.println("Remainder result is " + remainderResult);

        if (result < test) {
            System.out.println("Result is greater than 5");

        } else {
            System.out.println("Result is less than 5");
        }

    }

}
