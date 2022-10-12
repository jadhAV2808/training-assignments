package com.java11.assignments;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter amount");
		int p=scanner.nextInt();
		
		System.out.println("Enter no. of yeras");
		int n=scanner.nextInt();
		
		System.out.println("Enter rate of interest");
		int r=scanner.nextInt();
		
		FunInterf si=(int a,int b ,int c)->(a*b*c)/100;
		
		float result=si.operation(p, n, r);
		
		System.out.println("");	
		System.out.println("Simple interest will be "+result);
	}
	
}

interface FunInterf{
	float operation(int p,int n,int r);
}