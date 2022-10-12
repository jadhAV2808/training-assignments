package com.junit;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BankAccountTest {

	
	@Test
	@DisplayName("checking Exception")
	void testException() {
		BankAccount ba= new BankAccount();
		ba.setBalance(10000);
		assertThrows(InsufficientFundsException.class ,
				()->ba.withdraw(12000),"Oops!! low balance.");
	}

	@Test
	@DisplayName("checking balance")
	void testBalance() {
		BankAccount ba= new BankAccount();
		ba.setBalance(10000);
	
		int actual=ba.withdraw(2000);
		int expected=8000;
		assertEquals(expected,actual);
		
	}

	
	
}
