package com.java8;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter first no. : ");
		int i=scanner.nextInt();
		
		System.out.println("Enter second no. : ");
		int j=scanner.nextInt();
		
		Operation add=(int a,int b)->a+b;
		System.out.println("addition : "+add.perform(i, j));
		
		Operation subtract=(int a,int b)->a-b;
		System.out.println("subtraction : "+subtract.perform(i, j));
		
		Operation multiply=(int a,int b)->a*b;
		System.out.println("multiplication : "+multiply.perform(i, j));
		
		Operation divide=(int a,int b)->a/b;
		System.out.println("division : "+divide.perform(i, j));
		
	}

}

interface Operation{
	
	int perform(int a,int b);
}
