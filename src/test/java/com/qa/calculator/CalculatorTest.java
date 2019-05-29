package com.qa.calculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	Calculator calc; 

	@Before
	public void setup() {
		calc = new Calculator();
	}
	
	@After
	public void teardown() {
		calc.clear();
	}
	
	@Test
	public void addition() {
		
		int actualValue = calc.add(2, 2);
		Assert.assertEquals(4, actualValue);
	}
	@Test
	public void multiplication() {
		calc = new Calculator();
		int actualValue = calc.multiply(4, 5);
		Assert.assertEquals(20, actualValue);
	}
	
	@Test
	public void testSubtraction() {
		int storedValue = calc.sub(4,2);
		double anotherValue = calc.sub(4.5,2.4);
		calc.setValue(4.5, 2.4);
		anotherValue = calc.sub();
		Assert.assertEquals(2, storedValue);
		Assert.assertEquals(2.1, anotherValue,0.1);
	}
	
	@Test
	public void testPower() {
		calc.setValue(4,2);
		double returnedValue = calc.power();
		Assert.assertEquals(16, returnedValue,0.1);
		calc.clear();
		calc.setValue(4, 3);
		returnedValue = calc.power();
		Assert.assertEquals(64, returnedValue,0.1);
	}

}
