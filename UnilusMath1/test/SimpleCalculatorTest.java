/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import unilusmath1.SimpleCalculator;

/**
 *
 * @author MARCUS
 */
public class SimpleCalculatorTest {
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @Test
    public void testAdd(){
       int expectedResult  = 23;
       int actualResult  = SimpleCalculator.add(20, 3);
       
        assertEquals(expectedResult, actualResult);
        
    }
     
    @Test
    public void testDivide(){
        double expectedResult = 2.5;
        double actualResult =SimpleCalculator.divide(25.0, 10.0);
        
        assertEquals(expectedResult, actualResult,0.000001);
    }
     
     
     @Test
     public void testMultiply(){
         int expectedResult  = 20;
         int actutalResult  = SimpleCalculator.multiply(10,2);
         
         assertEquals(expectedResult, actutalResult);
     }
}
