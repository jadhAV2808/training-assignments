package com.string.assignments.stringbuffer;

public class Third {

	public static void main(String[] args) {
		
		StringBuffer buffer= new StringBuffer("this method returns the reversed object on which it was called");
		System.out.println("the original string is:- "+buffer);
		
		buffer.reverse();
		System.out.println("the new string is:- "+buffer);
	}

}
