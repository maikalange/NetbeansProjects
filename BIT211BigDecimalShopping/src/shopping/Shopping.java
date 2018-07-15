/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/**
 *
 * @author MARCUS
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BigDecimal soyaPieces = new BigDecimal(3.8);
        BigDecimal cookingOil = new BigDecimal(1.00);
        BigDecimal groundNutPowder = new BigDecimal(0.6);

        BigDecimal sweets = new BigDecimal(0.03);
        BigDecimal salt = new BigDecimal(1.05);
        BigDecimal matches = new BigDecimal(0.3);

        BigDecimal shoppingCost = matches.add(sweets).add(soyaPieces).
                add(cookingOil).add(groundNutPowder).add(salt);

        BigDecimal cashAvailable = new BigDecimal(10.26);
        BigDecimal change = new Change().calculate(cashAvailable, shoppingCost);

        System.out.println((double)new Change().calculate(1026, 678)/100);
        
        System.out.println(change.round(MathContext.DECIMAL32).stripTrailingZeros());
        System.out.println(10.26 - 3.8 - 1.0 - 0.6 - 0.03 - 1.05 - 0.30);
    }

    static class Change {
        BigDecimal calculate(BigDecimal cashAvailable, BigDecimal cashSpent) {
            return cashAvailable.subtract(cashSpent);
        }

        int calculate(int cashAvailable, int cashSpent) {
            return cashAvailable - cashSpent;
        }
    }
}
