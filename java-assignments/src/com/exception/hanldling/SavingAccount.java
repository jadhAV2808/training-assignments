package com.exception.hanldling;

public class SavingAccount {
	
	private long id;
	double balance=50000;
	
	void withdraw (double amount) throws InsufficientBalanceException
	{
	
	    if (amount > balance)
	        throw new InsufficientBalanceException("Balance is insufficient");
	    else
	    	System.out.println("available Amt. :"+(balance-amount));
	    
	}
	void deposit(double amount) throws IllegalBankTransctionException 
	{
		if(amount<0)
			throw new IllegalBankTransctionException("enter valid amount");
		else
	    	System.out.println("available Amt. :"+(balance+amount));
	}

}
