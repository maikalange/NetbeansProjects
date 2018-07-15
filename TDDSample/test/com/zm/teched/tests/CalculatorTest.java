/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zm.teched.tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MARCUS
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void testAdd(){
        int ExpectedResult  = 8;
        int actualResult  = CALCULator.add(5,3);
        assertEquals(ExpectedResult, actualResult);
    }
    
    @Test
    public void testMultiplication(){
        int expectedResult = 25;
        int actualResult  = CALCULator.multiply(5,5);
        
           assertEquals(expectedResult, actualResult);
    }
    
}
