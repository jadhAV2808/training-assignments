package com.intermediate.oops.third;

public class CurrentAccount extends Accounts{

double cashCredit;
	
CurrentAccount(){
		
	}

	public CurrentAccount(double cashCredit) {
		super();
		this.cashCredit = cashCredit;
	}
	
	public double getCash()
    {
         return (super.getCash()+cashCredit);
    }
}
