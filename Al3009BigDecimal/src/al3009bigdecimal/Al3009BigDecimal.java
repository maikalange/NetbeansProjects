/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package al3009bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 *
 * @author MARCUS
 */
public class Al3009BigDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gp = 2.30;
        double chk = 5.50;
        double sweets = 2.00;
        double kapenta = 3.35;
        double cabbage = 3.30;
        double busFare = 6.50;
        double cost = gp + chk + sweets + kapenta + cabbage + busFare;

        double change = 23 - cost;
        
        System.out.println(change);
        BigDecimal exactCost  = new BigDecimal(cost);
        BigDecimal cashInHand = new BigDecimal(23);
        BigDecimal exactChange  = cashInHand.subtract(exactCost).round(MathContext.DECIMAL32).stripTrailingZeros();
        
        System.out.println(exactChange);
    }
}
