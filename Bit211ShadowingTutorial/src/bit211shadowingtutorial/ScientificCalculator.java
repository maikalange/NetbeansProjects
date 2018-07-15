/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bit211shadowingtutorial;

import java.math.BigDecimal;

/**
 *
 * @author MARCUS
 */
public class ScientificCalculator extends Calculator{

    public ScientificCalculator(double x, double y) {
        super(x, y);
    }
    
    @Override
    public double add(){
        //add special complex number logic
        BigDecimal a = BigDecimal.valueOf(this.x);
        BigDecimal b  = BigDecimal.valueOf(this.y);
        return a.add(b).doubleValue();
    }
    
}
