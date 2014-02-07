package service.calculator;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CalculatorResult {
	
	private int result;
	
	public CalculatorResult()
	{
		
	}
	
	public CalculatorResult(int result)
	{
		this.result = result;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

}
