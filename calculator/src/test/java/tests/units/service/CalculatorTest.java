package tests.units.service;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.junit.Test;

import service.calculator.Calculator;

public class CalculatorTest {

	@Test
	public void Addition_Add1And3_ShouldResultIn4() {
		Calculator calculator = new Calculator();
		
		int result = calculator.addition(1,3);
		
		assertEquals(4, result);
	}
	
	@Test
	public void Addition_Add100And999_ShouldResultIn1099() {
		Calculator calculator = new Calculator();
		
		int result = calculator.addition(100,999);
		
		assertEquals(1099, result);
	}
		
	@Test
	public void Addition_Add100AndNegative100_ShouldResultIn0() {
		Calculator calculator = new Calculator();
		
		int result = calculator.addition(100,-100);
		
		assertEquals(0, result);
	}	

	@Test
	public void Subtraction_SubtractNegative100From100_ShouldResultIn200() {
		Calculator calculator = new Calculator();
		
		int result = calculator.subtraction(100,-100);
		
		assertEquals(200, result);
	}
	
	@Test
	public void Subtraction_Subtract100From990_ShouldResultIn890() {
		Calculator calculator = new Calculator();
		
		int result = calculator.subtraction(990,100);
		
		assertEquals(890, result);
	}
	

	@Test
	public void Multiplication_Multiply10times10_ShouldResultIn100() {
		Calculator calculator = new Calculator();
		
		int result = calculator.multiplication(10,10);
		
		assertEquals(100, result);
	}
	

	@Test
	public void Multiplication_Multiply10timesMinus10_ShouldResultInMinus100() {
		Calculator calculator = new Calculator();
		
		int result = calculator.multiplication(10,-10);
		
		assertEquals(-100, result);
	}	

	@Test
	public void Division_Divide10By10_ShouldResultIn1() {
		Calculator calculator = new Calculator();
		
		double result = calculator.division(10,10);
		
		assertEquals(1.0, result, 0.001);
	}

	@Test
	public void Division_Divide1000By10_ShouldResultIn100() {
		Calculator calculator = new Calculator();
		
		double result = calculator.division(1000,10);
		
		assertEquals(100, result, 0.001);
	}
	
	@Test
	public void Division_Divide1By10_ShouldResultIn0dot1() {
		Calculator calculator = new Calculator();
		
		double result = calculator.division(1,10);
		
		assertEquals(0.1, result, 0.001);
	}
	
	@Test(expected = ArithmeticException.class)
	public void Division_ByZero_ThrowsException() {
		Calculator calculator = new Calculator();
		
		double result = calculator.division(1,0);
	}

}
