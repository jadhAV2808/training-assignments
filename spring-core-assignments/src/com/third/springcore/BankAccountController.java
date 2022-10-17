package com.third.springcore;

public class BankAccountController {

	public double withdraw(long accountId , double  balance) {
		return balance;
		
	}
	
	public double deposit(long accountId , double  balance) {
		return balance;
		
	}
	
	public double getBalance(long accountId) {
		return accountId;
		
	}
	
	public boolean fundTranfer(long fromAccount , long toAccount , double amount) {
		return false;
		
	}
}
