package com.intermediate.oops.third;

public class Accounts {

	double cash;
	
	Accounts(){
		cash=0;
	}

	public Accounts(double cash) {
		this.cash = cash;
	}
	
	public double getCash()
    {
         return cash;
    }
}
