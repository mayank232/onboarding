package com.amdocs;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class SavingsAccountTest {

	
	private SavingsAccount account;
	private SavingsAccount accountSpy;
	
	@Before
	public void setup() {
		account=new SavingsAccount();
		
		accountSpy=spy(account);
	}
	
	@After
	public void tearDown() {
		account=null;
		accountSpy=null;
	}
	@Ignore
	@Test
	public void testWithdrawWhenCurrentBalanceIs500INR() throws InsufficientBalanceException {
		
		
		//Partial mocking or spying
		
		doReturn(5000.00).when(accountSpy).getBalance();
		doNothing().when(accountSpy).updateBalanceIntoDB(anyDouble());
		double updatedBalance=accountSpy.withdraw(1000.00);
		double expectedBalance=4000.00;
		
		assertEquals(expectedBalance,updatedBalance,0.0001);
		
		verify(accountSpy , times(1) ).getBalance();
		//check if updateBalanceIntoDB updated onlty once
		verify(accountSpy,times(1)).updateBalanceIntoDB(anyDouble());
	}
	
	@Test
	public void testWithdrawWhenCurrentBalanceIsInsufficient() {
		
		
		
		
		doReturn(500.00).when(accountSpy).getBalance();
		doNothing().when(accountSpy).updateBalanceIntoDB(anyDouble());
		boolean exceptionThrown=false;
		try
		{
			accountSpy.withdraw(1000.00);
			
		}
		catch(InsufficientBalanceException e) {
			exceptionThrown=true;
		}
		boolean expectedResponse=true;
		
		assertEquals(expectedResponse ,exceptionThrown);
		
		verify(accountSpy , times(1) ).getBalance();
		//check if updateBalanceIntoDB updated onlty once
		verify(accountSpy,times(0)).updateBalanceIntoDB(anyDouble());
	}
}
