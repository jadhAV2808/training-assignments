package com.intermediate.oops.second;

public class Main {

	public static void main(String[] args) {
		
		Employee e1=new Manager("Mihika",35000,5000);
		
		System.out.println("salary of "+ e1.name+" is "+e1.getSalary());

		
       Employee e2=new Labour("Maya",30000,2000);
		
		System.out.println("salary of "+ e2.name+" is "+e2.getSalary());

	}

}
