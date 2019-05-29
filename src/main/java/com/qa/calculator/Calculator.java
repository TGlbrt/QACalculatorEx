package com.qa.calculator;

import java.util.ArrayList;


public class Calculator implements Functions{
	private ArrayList<Double> storedValue;
	private double enumerator;
	
	public Calculator() {
		storedValue = new ArrayList<Double>();
	}
	

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
	
	public double sub() {
		return storedValue.get(0).doubleValue() - storedValue.get(1).doubleValue();
	}
	
	public double power() {
/*		double returnValue = 0;
		//returnValue = storedValue.get(0);
		double currentValue = -1;
		for(int i = 0;i < storedValue.get(1).intValue() - 1;i++) {
			if(i == 0) {
				returnValue += storedValue.get(0) * storedValue.get(0);
				currentValue = returnValue;
			}else {
				returnValue = currentValue * storedValue.get(0);
				currentValue = returnValue;
			}
		}*/
		enumerator = Math.pow(this.storedValue.get(0), this.storedValue.get(1));
		return getValue();
	}

	public void setValue(int numOne, int numTwo) {
		storedValue.add((double) numOne);
		storedValue.add((double) numTwo);
	}
	
	public void setValue(double numOne, double numTwo) {
		storedValue.add(numOne);
		storedValue.add(numTwo);
	}

	public void clear() {
		storedValue.clear();
	}

	public double getValue() {
		return enumerator;
	}

}
