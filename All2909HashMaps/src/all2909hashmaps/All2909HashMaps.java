/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all2909hashmaps;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author MARCUS
 */
public class All2909HashMaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Integer> presidents = new HashMap();

        presidents.put("Kaunda", 28);
        presidents.put("Chiluba", 10);
        presidents.put("Banda", 2);

        presidents.put("Lungu", 1);
        presidents.put("Mwanawasa", 7);
        presidents.put("Sata", 3);
//Display all the presidents i.e. all keys and values
        System.out.println(presidents);

        Set<String> presidentNames = presidents.keySet();
        
        for(String name:presidentNames){
            System.out.println(name);
        }
        
        for (Integer years : presidents.values()) {
            System.out.println(years);
        }
        
        int numberOfYears  = presidents.get("Sata");
        System.out.println(numberOfYears);
    }

}
