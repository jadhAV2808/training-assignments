package com.exception.hanldling;

import java.util.Scanner;

public abstract class Third {

	/*
	 * it has three classes that I have created in this package 
	 * IllegealBankTransactionException
	 * InsufficientBalanceException
	 * SavingAccount
	 */

	public static void main(String[] args) throws InsufficientBalanceException , IllegalBankTransctionException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("to withdraw ...........TYPE WIITHDRAW/withdraw");
		System.out.println("to deposit ...........TYPE DEPOSIT/deposit");
		String st=sc.next();
		System.out.println("Enter amount");
		double amt=sc.nextDouble();
		SavingAccount ac=new SavingAccount();
		System.out.println("");
		if(st.charAt(0)=='W' || st.charAt(0)=='w')
			ac.withdraw(amt);
		else if(st.charAt(0)=='D' || st.charAt(0)=='d')
			ac.deposit(amt);
		else
			System.out.println("plz provide valid input");
	}
}
