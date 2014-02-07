package service.calculator;

public class Calculator {

	public int addition(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}

	public int subtraction(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}

	public int multiplication(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}

	public double division(int firstNumber, int secondNumber) {
		if( secondNumber == 0 ) 
		{
			throw new ArithmeticException("Division by zero not allowed");
		}
		
		return (double)firstNumber/(double)secondNumber;
	}

}
