/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus.math;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 *
 * @author MARCUS
 */
public class Bit1122016PTShoppingTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double moneyAvailable  = 200.85;
        double cement = 2*53;
        double okra  = 4.55;
        double pamela  = 10;
        double sweets  = 3.05;
        double movies  = 7.50;
        double salt  = 1.85;
        double cookingOil =2.00;
        double busFare  = 3.00;
        
        double totalCost  = cement+ okra + pamela+ sweets+  movies+salt+cookingOil+busFare;
        System.out.println(totalCost);
        double change  = moneyAvailable - totalCost;
        
        System.out.println(change);

        BigDecimal myCost  = new BigDecimal(Double.valueOf(totalCost)).setScale(2, RoundingMode.UP);
        BigDecimal myMoney  = new BigDecimal(Double.valueOf(moneyAvailable)).setScale(2, RoundingMode.UP);

        BigDecimal myChange  = myMoney.subtract(myCost);
        System.out.println(myChange.toPlainString());
    }
    
}
