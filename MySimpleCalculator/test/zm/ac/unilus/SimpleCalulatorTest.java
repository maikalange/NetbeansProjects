/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.ac.unilus;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MARCUS
 */
public class SimpleCalulatorTest {
    
    public SimpleCalulatorTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of multiply method, of class SimpleCalulator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int x = 0;
        int y = 0;
        SimpleCalulator instance = new SimpleCalulator();
        int expResult = 0;
        int result = instance.multiply(x, y);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class SimpleCalulator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int x = 0;
        int y = 0;
        int expResult = 0;
        int result = SimpleCalulator.add(x, y);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class SimpleCalulator.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int x = 0;
        int y = 0;
        double expResult = 0.0;
        double result = SimpleCalulator.divide(x, y);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class SimpleCalulator.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        int x = 0;
        int y = 0;
        double expResult = 0.0;
        double result = SimpleCalulator.subtract(x, y);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }
    
}
