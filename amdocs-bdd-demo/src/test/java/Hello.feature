Feature: Develop a Hello World Java Application

	Scenario: Should be able to invoke sayHello greeting Method
		Given I have created a hello object
		When I invoke the sayHello method on the hello object
		Then I expect the response as "Hello BOD!"