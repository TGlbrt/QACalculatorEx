package com.qa.calculator;

public class ErrorCheck {
	private Calculator calc;
	public void check(int userInputOne, int userInputTwo, String userOperator) {
		
		
		if (userOperator.equals("/") || userOperator.equalsIgnoreCase("divide")) {
			divZero(userInputOne, userInputTwo);
		} else if (userOperator.equals("+") || userOperator.equalsIgnoreCase("add")) {
			calc.add(userInputOne, userInputTwo);
		} else if (userOperator.equals("-") || userOperator.equalsIgnoreCase("subtract")||userOperator.equals("minus") || userOperator.equalsIgnoreCase("sub")) {
			calc.sub(userInputOne, userInputTwo);
		} else if (userOperator.equals("*") || userOperator.equalsIgnoreCase("x")||userOperator.equals("times") || userOperator.equalsIgnoreCase("multiply")) {
			
		}

	}

	public void divZero(int userInputOne, int userInputTwo) {
		if (userInputOne == 0 || userInputTwo == 0) {
			System.out.println("Error cannot not divide by zero");
		} else if (userInputOne == 0 && userInputTwo == 0) {
			System.out.println("the answer is 1");
		} else {
			calc= new Calculator();
			calc.division(userInputOne, userInputTwo);
		}
	}
}
