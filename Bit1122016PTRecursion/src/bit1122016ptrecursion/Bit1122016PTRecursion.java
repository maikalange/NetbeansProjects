package bit1122016ptrecursion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author MARCUS
 */
public class Bit1122016PTRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //countTo(20);
        countToV2(3);
    }
    
    private static void countToV2(int j){

        System.out.println(j);
        countToV2(j-1);

    }

    private static void countTo(int j) {
        for (int i = 1; i <= j; i = i + 1) {
            System.out.println(i);
        }
    }

}
