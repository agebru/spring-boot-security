package com.mockito.test;

public class MathApplication {
	private CalculatorService calculatorService;

	public void setCalculatorService(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}
	
	public double addAndDouble(double num1,double num2){
		return 2*calculatorService.add(num1, num2);
		
	}
	
	public double substractAndAdd1(double num1,double num2){
		return calculatorService.subtract(num1, num2)+1;
		
	}
	public double multiplyAndAdd10(double num1,double num2){
		return calculatorService.multiply(num1, num2)+10;
		
	}
	public double devideAndAdd40(double num1,double num2){
		return calculatorService.divide(num1, num2)+40;
		
	}

}
