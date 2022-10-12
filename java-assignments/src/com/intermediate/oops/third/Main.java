package com.intermediate.oops.third;

public class Main {

	public static void main(String[] args) {
		
	Accounts currentAccount=new CurrentAccount(2000.0);
	Accounts savingsAccount=new SavingsAccount(4000.0);
	
	double totalCash=currentAccount.getCash()+savingsAccount.getCash();
	System.out.println("Total Cash in the  bank is "+totalCash );
	}

}
