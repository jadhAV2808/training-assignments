package com.intermediate.oops.second;

public class Manager extends Employee {

	//String name;
	//float salary;
	float incentives;

	
	public Manager() {
		
	}

	public Manager( String name, float salary,float incentives) {
		super(name,salary);
		this.incentives = incentives;
	}


	public float getSalary()
	    {
	         return (super.getSalary()+incentives);
	    }

}
