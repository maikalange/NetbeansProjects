/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit112ptarraylisttutorial;

import java.util.ArrayList;

/**
 *
 * @author MARCUS
 */
public class BIT112PTArrayListTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Cat> pets  = new ArrayList<>();
        
        pets.add(new Cat("Tom", 2));
        pets.add(new Cat("Muffin", 1));
        
        for(Cat i: pets){
            i.pur();
        }
    }
    
}
