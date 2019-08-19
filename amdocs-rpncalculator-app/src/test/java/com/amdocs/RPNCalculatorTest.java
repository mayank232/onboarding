package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class RPNCalculatorTest {
	
	private RPNCalculator rpnCalculator;
	private double actualResult , expectedResult;
	
	@BeforeClass
	public static void initOnce() {
		System.out.println("Before Class Method");
	}
	
	@AfterClass
	public static void tearDown() {
		System.out.println("After Class Method");
	}
  
	@Test
	public void testSimpleAddition()
	{
		RPNCalculator rpnCalculator= new RPNCalculator();
		double actualResult = rpnCalculator.evaluate("10 15 +" );
		double expectedResult= 25.0;
		
		assertEquals( expectedResult,actualResult,0.0001);
		
		 actualResult = rpnCalculator.evaluate("10 115 +" );
		 expectedResult= 125.0;
		
		assertEquals( expectedResult,actualResult,0.0001);
	}
	
	
	@Test
	public void testSimpleSubtraction()
	{
		RPNCalculator rpnCalculator= new RPNCalculator();
		double actualResult = rpnCalculator.evaluate("100 15 -" );
		double expectedResult= 85.0;
		
		assertEquals( expectedResult,actualResult,0.0001);
		
		 actualResult = rpnCalculator.evaluate("10 5 -" );
		 expectedResult= 5.0;
		
		assertEquals( expectedResult,actualResult,0.0001);
	}
	
	@Test
	public void testSimpleMultiplication()
	{
		RPNCalculator rpnCalculator= new RPNCalculator();
		double actualResult = rpnCalculator.evaluate("100 15 *" );
		double expectedResult= 1500.0;
		
		assertEquals( expectedResult,actualResult,0.0001);
		
		 actualResult = rpnCalculator.evaluate("10 5 *" );
		 expectedResult= 50.0;
		
		assertEquals( expectedResult,actualResult,0.0001);
	}
	
	@Test
	public void testSimpleDivision()
	{
		RPNCalculator rpnCalculator= new RPNCalculator();
		double actualResult = rpnCalculator.evaluate("105 15 /" );
		double expectedResult= 7.0;
		
		assertEquals( expectedResult,actualResult,0.0001);
		
		 actualResult = rpnCalculator.evaluate("10 5 /" );
		 expectedResult= 2.0;
		
		assertEquals( expectedResult,actualResult,0.0001);
	}
	
}


