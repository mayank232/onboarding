package com.amdocs;

public class SavingsAccount {

	public double getBalance() {
		System.out.println("Assume balance is retrievd from database");
		return 7000.00;
	}
	
	public double withdraw(double amountToBeWithdrawn)throws InsufficientBalanceException {
		System.out.println("Inside withdraw method");
		
		double currentBalance=getBalance();
		
		if(amountToBeWithdrawn<currentBalance)
			currentBalance-=amountToBeWithdrawn;
		updateBalanceIntoDB(currentBalance);
		
		return currentBalance;
	}

	public void updateBalanceIntoDB(double currentBalance) {
		System.out.println("Assume here balance is updated");
		
	}
	
}
