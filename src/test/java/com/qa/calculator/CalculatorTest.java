package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
Calculator calc; 
	@Test
	public void addition() {
		calc = new Calculator();
		int actualValue = calc.add(2, 2);
		Assert.assertEquals(4, actualValue);
	}

}
