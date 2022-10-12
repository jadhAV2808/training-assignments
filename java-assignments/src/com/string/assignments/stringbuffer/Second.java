package com.string.assignments.stringbuffer;

public class Second {

	public static void main(String[] args) {
		
		StringBuffer buffer= new StringBuffer("it is used to _ at the specified index position.");
		System.out.println("the original string is:- "+buffer);
		
		buffer.replace(14, 15, "insert text");
		System.out.println("the new string is:- "+buffer);
	}

}
