package com.junit;

public class BankAccount {

	int balance;

	/*
	public BankAccount(int balance) {
		super();
		this.balance = balance;
	}
	*/
	
	
	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public int withdraw(int amount) throws InsufficientFundsException{
		
		if(amount>balance)
			throw new InsufficientFundsException("Oops!! low balance.");
		else
			return (balance-amount);
	}
}


class InsufficientFundsException extends RuntimeException{
	
	InsufficientFundsException(String s){
		super(s);
	}
}