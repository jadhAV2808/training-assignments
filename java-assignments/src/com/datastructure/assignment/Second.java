package com.datastructure.assignment;

//Armstrong numbers between 100-999

import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=100;i<=999;i++) {
			
			int remainder,sum=0, copy; 
			int n=copy=i;
			
			while(n!=0) {
				
				 remainder=n%10;
				 sum=sum+(remainder*remainder*remainder);
				 n=n/10;
				
			}
			if(copy==sum) 
				System.out.print(sum+" ");
		}

		sc.close();
	}

}
