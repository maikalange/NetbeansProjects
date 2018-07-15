/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import unilusmath.SimpleCalculator;

/**
 *
 * @author MARCUS
 */
public class SimpleCalculatorTest {

    public SimpleCalculatorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAdd() {
        int actualResult = SimpleCalculator.add(20, 5);
        int expectedResult = 25;
        assert (actualResult == expectedResult);
    }

    @Test
    public void testSubtraction() {
        int expectedResult = SimpleCalculator.subtract(12, 5);
        int actualResult = 7;

        assert (actualResult == expectedResult);
    }

    @Test
    public void testMultiply() {
        double expectedResult = SimpleCalculator.multiply(12, 5);
        int actualResult = 60;

        assert (actualResult == expectedResult);
    }

    @Test
    public void testDivision() {
        double expectedResult = SimpleCalculator.divide(12, 5);
        double actualResult = 2.4;

        assert (actualResult == expectedResult);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZeroShouldThrowException() {
        double expectedResult = SimpleCalculator.divide(0, 0);

    }

}
