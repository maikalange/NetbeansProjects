/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211pthashmapstutorial;

import java.util.HashMap;

/**
 *
 * @author MARCUS
 */
public class HashMapWithObjectValues {

    public static void main(String[] args) {
        HashMap<Long, TaxPayer> consignees = new HashMap<>();

        consignees.put(1234567890L, new TaxPayer(1234567890L, "Frank Sinatra"));
        consignees.put(1234567860L, new TaxPayer(1234567860L, "Miles Davis"));

        for(TaxPayer tp: consignees.values()){
            tp.makePayment(500D);
            System.out.println(tp);
        }
        
        TaxPayer tp  = consignees.get(1234567890L);
        tp.makePayment(50);
        
        System.out.println(tp);
    }

}
