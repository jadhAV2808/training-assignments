package com.intermediate.oops.second;

public class Employee {
	
	String name;
    float salary;
    Employee()
    {
         name = null;
         salary = 0;
    }
    Employee (String name, float salary)
    {
         this.name = name;
         this.salary = salary;
    }
    public float getSalary()
    {
         return salary;
    }

}
