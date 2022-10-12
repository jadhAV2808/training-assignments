package com.exception.hanldling;

public class InsufficientBalanceException extends RuntimeException{
	
	InsufficientBalanceException(String s){
		super(s);
	}

}
