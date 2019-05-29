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
	
	@Test
	public void testSubtraction() {
		Calculator aCalc = new Calculator();
		int storedValue = aCalc.sub(4,2);
		double anotherValue = aCalc.sub(4.5,2.4);
		Assert.assertEquals(2, storedValue);
		Assert.assertEquals(2.1, anotherValue,0.1);
	}

}
