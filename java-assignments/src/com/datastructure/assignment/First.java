// find out the given number is Armstrong or not

package com.datastructure.assignment;
import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want check :- ");
		
		int n=sc.nextInt();
		
		
		int remainder,sum=0, copy=n;
		
		while(n!=0) {
			
			 remainder=n%10;
			 sum=sum+(remainder*remainder*remainder);
			 n=n/10;
			
		}
	
	if(copy==sum) 
		System.out.println("number is Armstrong");
	else
		System.out.println("number is NOT Armstrong");
	
	
	sc.close();
  }
	
	
}
