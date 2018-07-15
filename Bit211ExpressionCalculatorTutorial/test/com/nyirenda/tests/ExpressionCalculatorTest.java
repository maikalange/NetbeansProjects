/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nyirenda.tests;

import com.nyirenda.app.ExpressionCalculator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MARCUS
 */
public class ExpressionCalculatorTest {

    public ExpressionCalculatorTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testAdd() {
        double expectedResult = 20d;
        double actualResult = ExpressionCalculator.add("12+8");

        assertEquals(expectedResult, actualResult, .00000000005);
    }

}
