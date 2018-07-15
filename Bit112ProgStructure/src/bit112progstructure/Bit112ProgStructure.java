/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112progstructure;

/**
 *
 * @author MARCUS
 */
public class Bit112ProgStructure {

    //declare a field to store a name
    private static String name = "Rupiah Banda";

    public static void main(String[] args) {
        //Call the add method and store answer in a variable
        int answer = add(12, 123);
        int result = multiply(112, 12);

        System.out.println(answer);
        System.out.println(name);
        System.out.println(result);
    }

    public static int add(int y, int x) {
        System.out.println(name);
        return y + x;
    }

    private static int multiply(int y, int x) {
        return y * x;
    }

}
