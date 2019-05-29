package com.qa.calculator;

public class Calculator {

	public int add(int numOne, int numTwo) {
		Addition add = new Addition();
		add.setValue(numOne, numTwo);
		int answer = add.getValue();
		return answer;
	}
	
	public int sub(int numberOne, int numberTwo) {
		return numberOne - numberTwo;
	}
	
	public double sub(double numberOne, double numberTwo) {
		return numberOne - numberTwo;
	}
	


}
