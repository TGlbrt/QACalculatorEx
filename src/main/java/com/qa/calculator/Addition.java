package com.qa.calculator;

public class Addition implements Functions {
	private int value;
	private double valueDouble;

	public void setValue(int numOne, int numTwo) {
		this.value = numOne + numTwo;

	}

	public void setValue(double numOne, double numTwo) {
		this.valueDouble =  numOne + numTwo;

	}

	public int getValue() {
		return this.value;
	}

	public double getValueDouble() {
		return this.valueDouble;
	}

}
