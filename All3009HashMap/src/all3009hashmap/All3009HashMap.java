/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all3009hashmap;

import java.util.HashMap;

/**
 *
 * @author MARCUS
 */
public class All3009HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Long,TaxPayer> consignees = new HashMap<>();
        consignees.put(1234567890L, new TaxPayer(1234567890L,"Frank Sinatra"));
        consignees.put(1234567899L, new TaxPayer(1234567890L,"Miles Davies"));
    
        for(TaxPayer tp: consignees.values()){
            tp.makePayment(150.13);
            System.out.println(tp);
        }
    }
    
}
