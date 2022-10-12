package com.datastructure.assignment;

import java.util.Scanner;

public class Ninth {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of First Student");
		String s1=sc.next();
		int[] arr1=new int[3];
		System.out.println("Enter marks of First Student");
		for(int i=0;i<3;i++) {
			arr1[i]=sc.nextInt();
			
		}
		int totalScore1=arr1[0]+arr1[1]+arr1[2];
		int average1=(totalScore1/3);
		
		System.out.println(s1+"'s totalSccore="+totalScore1+ " avg="+average1);

		
		System.out.println("Enter name of Second Student");
		String s2=sc.next();
		int[] arr2=new int[3];
		System.out.println("Enter marks of Second Student");
		for(int i=0;i<3;i++) {
			arr2[i]=sc.nextInt();
		}
		int totalScore2=arr2[0]+arr2[1]+arr2[2];
		int average2=(totalScore2/3);
		System.out.println(s2+"'s totalSccore="+totalScore2+ " avg="+average2);
	
	System.out.println("Enter name of third Student");
	String s3=sc.next();
	int[] arr3=new int[3];
	System.out.println("Enter marks of third Student");
	for(int i=0;i<3;i++) {
		arr3[i]=sc.nextInt();
	}
	
	int totalScore3=arr3[0]+arr3[1]+arr3[2];
	int average3=(totalScore3/3);
	System.out.println(s3+"'s totalSccore="+totalScore3+ " avg="+average3);


	

	}

}
