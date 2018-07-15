/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211residentialhashmaptutorial;

import static java.lang.System.out;
import java.util.HashMap;

/**
 *
 * @author MARCUS
 */
public class Bit211ResidentialHashMapTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        HashMap<String,PensionRecord> pensions = new HashMap<>();
        pensions.put("789784/15/1", new PensionRecord("789784/15/1", "434ASDE434GHJ"));
        
        for(PensionRecord p: pensions.values()){
            out.println(p);
        }
        
        //Retrieve object using key
        PensionRecord record = pensions.get("789784/15/1");
        out.println(record);
    }  
}
