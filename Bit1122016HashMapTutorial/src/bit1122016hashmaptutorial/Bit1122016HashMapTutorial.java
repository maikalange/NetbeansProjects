/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit1122016hashmaptutorial;

import java.util.HashMap;

/**
 *
 * @author MARCUS
 */
public class Bit1122016HashMapTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        HashMap<Integer, String> taxPayers = new HashMap();
        //Adding items to a hashmap
        taxPayers.put(452352312, "John Mulenga");
        taxPayers.put(24324242, "Charles Mulenga");
        taxPayers.put(12132452, "Mary Mulenga");
        taxPayers.put(8707882, "Adam Mulenga");
        
        //Removing items from the hashmap
        taxPayers.remove(24324242);
        
        //enhanced for loop accessing all items
        for(String name: taxPayers.values()){
            System.out.println(name);
        }
        
        //Getting a single value from the collection
        String name  = taxPayers.get(24324242);
        System.out.println(name);
        
        String number ="123123";
        String number2 = "123.56";
        
        int formatedNumber  = Integer.parseInt(number);
         double formatedNumber2 =Double.parseDouble(number2);
    }
}
