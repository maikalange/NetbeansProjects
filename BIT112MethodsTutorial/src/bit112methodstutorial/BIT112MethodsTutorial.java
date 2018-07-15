/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112methodstutorial;

/**
 *
 * @author MARCUS
 */
public class BIT112MethodsTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = add(52, 7);
        System.out.println(sum);
        int result = subtract(37, 5);
        System.out.println(result);

        /*printGreeting methods are overloaded methods. they have the same name but 
        different parameter definitions*/
        
        printGreeting();
        printGreeting("John Smith");
        
        countTo(-100);

    }

    private static int add(int i, int j) {

        return i + j;
    }

    private static int subtract(int i, int j) {

        return i - j;
    }

    private static void printGreeting() {
        System.out.println("Hello BIT 112.Java is cool!");
    }

    private static void printGreeting(String name) {

        System.out.println("Hello " + name);
    }

    private static void countTo(int i) {
        for (int j = 1; j <= i; j++) {
            System.out.println(j);
        }
    }

}
