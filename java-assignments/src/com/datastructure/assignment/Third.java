//find out simple and compound interest of supplied values.

package com.datastructure.assignment;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter principal :-");
		double P=sc.nextDouble();
		
		System.out.println("Enter rate of interest :-");
		double R =sc.nextDouble();
		
		System.out.println("Enter Time in years :-");
		double T=sc.nextDouble();
		
		double SI, Amount,CI;
		
		SI=(P*R*T)/100;
		
		Amount= P*(Math.pow((1+(R/100)), T));
		
		CI=Amount-P;
		
		System.out.println("Simple Interest :- "+ SI);
		System.out.println("Compound Interest :- "+ CI);
		
	}

}
