package com.ncu.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
	public void evaluateExpression() {
		Calculator calc = new Calculator();
		String expression = "1+2+3+4";
		int sum = calc.evaluate(expression);
		int expectedResult = 10;
		assertEquals(expectedResult, sum);
		
	}
	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		int sum = calc.add(10, 5);
		int expectedResult = 15;
		assertEquals(expectedResult, sum);
		
	}
	@Test
    public void testSubtract() {
    	Calculator calc = new Calculator();
    	int sub = calc.subtract(10, 5);
		int expectedResult = 5;
		assertEquals(expectedResult, sub);
		
	}
	@Test
    public void testMultiply() {
    	Calculator calc = new Calculator();
    	int mul = calc.multiply(10, 5);
		int expectedResult = 50;
		assertEquals(expectedResult, mul);
	
    }
	@Test
    public void testDivide() {
    	Calculator calc = new Calculator();
    	double div  = calc.divide(10, 5);
		int expectedResult = 2;
		assertEquals(expectedResult, div,0.1);
	
}
}

