/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112ptwhileloops;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author MARCUS
 */
public class BIT112PTWhileLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int i = 1;
        while (i <= 50) {
            if (i % 2 == 0) {
                System.out.println(i);                
            }
            
            i++;
        }
        
        int j = 0;
        
        do {
            System.out.println(j * 10);
            j++;
        } while (j <= 10);
//        
//        Integer[] scores = {2, 4, 1, 2, 3, 2, 1, 2, 2, 1, 2, 9};
//        
//        Arrays.sort(scores, Comparator.reverseOrder());
//        
//        int[] reversed = new int[scores.length];
//        int index = 0;
//        
//        for (int k = scores.length - 1; k >= 0; k--) {
//            if (index < scores.length) {
//                
//                reversed[index] = scores[k];
//                
//                System.out.println(reversed[index]);
//                
//            }
//            index++;
//        }
        
    }
    
}
