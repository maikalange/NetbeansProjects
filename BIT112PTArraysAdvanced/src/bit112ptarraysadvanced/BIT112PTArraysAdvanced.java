/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112ptarraysadvanced;

/**
 *
 * @author MARCUS
 */
public class BIT112PTArraysAdvanced {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] childWeights = new int[3];
        childWeights[0] = 8;
        childWeights[1] = 4;
        childWeights[2] = 15;

        for (int i = 0; i < childWeights.length; i++) {
            childWeights[i] = childWeights[i] + 2;
        }
        //---------------------------------------------------------
        //Calculate the average weight of the children
        int sum = 0;
        for (int i = 0; i < childWeights.length; i++) {
            sum = childWeights[i] + sum;
        }
        System.out.println((double) sum / 3);

        int[] ages = {10, 2, 7};
        //Youngest child's age
        int youngest = ages[1];
        int oldest = ages[0];
        //Oldest child's age

        double[] myList = {1, 5, 15, 65, 6, 1};
        double max = myList[0];
        int indexOfMax = 0;
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
                indexOfMax = i;
            }
        }
        System.out.println(indexOfMax);

        int[] x = new int[5];
        int i;
        for (i = 0; i < x.length; i++) {
            x[i] = i;
        }
        System.out.println(x[i]);
    }
}


