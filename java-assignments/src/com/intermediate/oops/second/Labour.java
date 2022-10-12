package com.intermediate.oops.second;

public class Labour extends Employee{
	
//	String name;
//	Float salary;
	float overtime;
	
	
	public Labour() {
		
	}


	public Labour(String name, float salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}


	public Labour( String name, float salary ,float overtime) {
	super(name,salary);
	this.overtime = overtime;
}


	public float getSalary()
    {
         return (super.getSalary()+overtime);
    }
	

}
