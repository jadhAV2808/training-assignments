package com.java8;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		
        Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter Amount : ");
		Integer a=scanner.nextInt();
		
		Interf price=(int i)->{
			if(i>10000)
				return "ACCEPTED";
			else
				return "NOT ACCEPTED";
		};
		
		System.out.print(price.operation(a));
		
	}

}

interface Interf{
	String operation(int i);
}