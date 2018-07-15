/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112ptforloops;

/**
 *
 * @author MARCUS
 */
public class Bit112PTForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Counts from 0 to 9
        for (int i = 0; i < 10; i = i + 1) {//starts first for loop
            //Print even numbers
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }//ends first for loop

        System.out.println("---------------------------------------");

        //Counts backwards from 10 to 0
        for (int i = 10; i >= 0; i--) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        
    }
    
}
