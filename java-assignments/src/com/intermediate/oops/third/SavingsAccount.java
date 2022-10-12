package com.intermediate.oops.third;

public class SavingsAccount extends Accounts {

	double fixedDeposit;
	
	SavingsAccount(){
		
	}

	public SavingsAccount(double fixedDeposit) {
		super();
		this.fixedDeposit = fixedDeposit;
	}
	
	public double getCash()
    {
         return (super.getCash()+fixedDeposit);
    }
	
}
