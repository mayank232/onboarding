package com.amdocs;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	private String soapWSDLURL;
	private String rpnMathExpression;
	private double actualResult;
	
	@Given("I have deploymentthe RPNCalculator SOAP api at URL {string}")
	public void getSOAPWSDLURL(String wsdlURL) {
	    
		soapWSDLURL=wsdlURL;
	}

	@Given("the input is{string}")
	public void setInput(String rpnMathExpression) {
	    this.rpnMathExpression=rpnMathExpression;
	}

	@When("I invoke the SOAP API")
	public void invokeRPNCalculatorSOAPAPI(){
	    RPNCalculatorService rpnWebService=new RPNCalculatorService();
	    RPNCalculator rpnCalculator=rpnWebService.getRPNcalculator();
	    
	    actualResult=rpnCalculator.evaluate(rpnMathExpresson);
	}

	@Then("I expect the response as {string}")
	public void verifyExpectedResult(String expectedResult) {
	    assertEquals(expectedResult,actualResult);	}

}
