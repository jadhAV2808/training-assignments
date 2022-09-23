package com.datastructure.assignment;

import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Income :-");
		double income=sc.nextDouble();
		
		if(income>0 & income<=180000)
			System.out.println("NIL");
		else if(income>180001 & income<=300000)
			System.out.println("TAX = "+ 0.1*income);
		else if(income>300001 & income<=500000)
			System.out.println("TAX = "+ 0.2*income);
		else if(income>500001 & income<=1000000)
			System.out.println("TAX = "+ 0.3*income);
		

	}

}
