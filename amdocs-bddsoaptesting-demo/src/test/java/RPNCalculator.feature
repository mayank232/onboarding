Feature: Develop a RPN Calculator application in java.

	Scenario: Simple Addition
		Given I have deploymentthe RPNCalculator SOAP api at URL "http://localhost:8080/rpncalculator.ws/services/rpncalculator?wsdl"
		And the input is"10 15 +"
		When I invoke the SOAP API
		Then I expect the response as "25.0"