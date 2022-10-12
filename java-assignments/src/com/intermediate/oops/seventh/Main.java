package com.intermediate.oops.seventh;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String role;
		Scanner scanner=new Scanner(System.in);
		role=scanner.next();
		if(role.equalsIgnoreCase("customer")) {
			//place order
		}
		else if(role.equalsIgnoreCase("owner")) {
			//add desert to our stoage
		}
		else {
			System.out.println("please selcet appropriate role");
			
		}
			
	}

}
