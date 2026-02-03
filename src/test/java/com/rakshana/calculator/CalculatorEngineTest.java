package com.rakshana.calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

/**
 * Unit tests for CalculatorEngine
 */
public class CalculatorEngineTest {

    private CalculatorEngine calculator;

    @Before
    public void setUp() {
        calculator = new CalculatorEngine();
    }

    @Test
    public void testAddition() {
        String result = calculator.processInput("+", "5");
        result = calculator.processInput("=", "3");
        assertEquals("8.0", result);
    }

    @Test
    public void testClear() {
        String result = calculator.processInput("C", "123");
        assertEquals("0", result);
    }
}
