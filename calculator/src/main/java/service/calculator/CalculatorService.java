package service.calculator;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/calculator")
public class CalculatorService {

	private static Calculator calculator;
	
	public CalculatorService() {
		calculator = new Calculator();
	}	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public CalculatorResult addition(@QueryParam("firstNumber") String firstNumber, @QueryParam("secondNumber") String secondNumber) {
		
		int n1 = Integer.parseInt(firstNumber);
		int n2 = Integer.parseInt(secondNumber);
				
		CalculatorResult response = new CalculatorResult(calculator.addition(n1, n2));
		
		return response;
	}
}
