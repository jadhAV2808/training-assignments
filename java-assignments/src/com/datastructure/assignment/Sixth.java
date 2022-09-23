package com.datastructure.assignment;

import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		String username="pooja",pwd="pass@123";
		for(int i=1;i<=3;i++) {
			
			System.out.println("Enter username :-");
			String userId=sc.next();
			
			System.out.println("Enter password :-");
			String pass=sc.next();
			
			if(userId.equals(username) & pass.equals(pwd)) {
				flag=false;
				System.out.print("Welcome "+ userId);
				break;
			}
		}
		if(flag)
		System.out.print("Contact Admin");

	}

}
