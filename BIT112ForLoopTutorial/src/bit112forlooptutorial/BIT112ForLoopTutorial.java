/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112forlooptutorial;

/**
 *
 * @author MARCUS
 */
public class BIT112ForLoopTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            System.out.println("Welcome to Java");
        }
        //add all numbers between 1 and100
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        double average = (double) sum / 100;
        System.out.println(average);
        
        for (int i = 10; i > 0; i=i-1) {
            System.out.println(i);
        }
    }

}
