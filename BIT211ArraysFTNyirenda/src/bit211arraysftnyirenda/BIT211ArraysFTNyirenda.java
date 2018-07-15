/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211arraysftnyirenda;

/**
 *
 * @author MARCUS
 */
public class BIT211ArraysFTNyirenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] scores = populateArray(12);
       
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
    
    
    private static int[] populateArray(int length){
        int [] myArray = new int[length];
        
        
        for (int i = 0; i < myArray.length; i++) {
            
            myArray[i] = (int) (10*Math.random());
        }
        
        
        return myArray;
    }
    
}
