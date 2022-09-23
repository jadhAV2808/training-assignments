package com.datastructure.assignment;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter sub1 marks :-");
		int s1=sc.nextInt();
		
		System.out.println("Enter sub2 marks :-");
		int s2=sc.nextInt();
		
		System.out.println("Enter sub3 marks :-");
		int s3=sc.nextInt();

		if(s1>60 & s2>60 & s3>60)
			System.out.print("PASS");
		else if(s1>60 & s2>60 || s2>60 & s3>60 || s1>60 & s3>60 )
			System.out.print("POMOTED");
		else
			System.out.print("FAIL");
			
	}

}
