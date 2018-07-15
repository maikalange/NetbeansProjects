/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alliancemethods;

/**
 *
 * @author MARCUS
 */
public class AllianceMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int result = add(12, 7);
        System.out.println(result);

        int answer = multiply(10, 5);

        System.out.println(answer);

        //This add method is overloaded
        double total = add(5, 6, 7);
        System.out.println(total);

        printGreeting();
        printGreeting("John Wayne");
        String name   = getName();
        
        System.out.println(name);
    }
    private static int add(int i, int j) {

        return i + j;
    }

    private static double add(int i, int j, int k) {
        return i + j + k;
    }

    private static int multiply(int i, int j) {
        return i * j;
    }
    private static void printGreeting() {
        System.out.println("Hello world");
    }

    private static void printGreeting(String name) {
        System.out.println("Howdy cowboy! " + name);
    }

    private static String getName() {
        return "John Wayne";
    }
}
