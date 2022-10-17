package com.third.springcore;

public class BankAccount {

	long accountId;
	String accountHolderName;
	String accountTypeString;
	double accountBalance;
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountTypeString() {
		return accountTypeString;
	}
	public void setAccountTypeString(String accountTypeString) {
		this.accountTypeString = accountTypeString;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
	
}
