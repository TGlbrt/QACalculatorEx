package com.qa.calculator;

public class Addition implements Functions {
	private double valueDouble;

	public void setValue(double numOne, double numTwo) {
		this.valueDouble =  numOne + numTwo;

	}

	public double getValue() {
		return this.valueDouble;
	}

}
