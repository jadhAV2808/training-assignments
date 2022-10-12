
/*
 * use HashSet to hold Employee object. upon running the application
 * the details of the employee added to the HashSet should be displayed. 
 */

package com.generics;

import java.util.HashSet;

public class First {

	public static void main(String[] args) {
		
		HashSet<Employee> set=new HashSet<>();
		
		Employee e1=new Employee(101,"liza","HR-Administrative",45000);
		set.add(e1);
		e1.displayDetails();

	}

}

class Employee{
	
	int id;
	String name,department;
	double salary;
	//constructor using fields.
	public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public void displayDetails() {
		System.out.println("\n employee Id:- "+ this.id+ " \n Employee Name:- "+this.name + "\n Department:- "+this.department+"\n Salary:- "+this.salary);
	}
	
}
