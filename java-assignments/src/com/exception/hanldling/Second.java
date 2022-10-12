package com.exception.hanldling;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter  dividend");
		int dividend=sc.nextInt();
		
		System.out.println("enter  divisor");
		int divisor=sc.nextInt();
		
		try {
			int result=dividend/divisor;
			System.out.println(result);
		}
		catch(UnsupportedOperationException  e) {
			System.out.println(e.toString());
		}
		catch(Exception e) {
			
			System.out.println(e.toString());
		}
		finally {
			sc.close();
		}
		System.out.println("end of main");
	}

}
