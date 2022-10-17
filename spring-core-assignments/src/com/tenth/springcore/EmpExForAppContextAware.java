package com.tenth.springcore;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class EmpExForAppContextAware implements ApplicationContextAware{

	private ApplicationContext applicationContext=null;
	
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		//System.out.println("from setApplicationContext method of ApplicationContextAware");
		this.applicationContext=applicationContext;
	}
	
	public void displayEmpDetails() {
		
		System.out.println("Getting Employee object from AppicationContextAware........");
		System.out.println("  ");
		Employee employee= applicationContext.getBean("employee" , Employee.class);
		System.out.println(employee.id+"--->"+employee.name+"--->"+employee.dept+"--->"+employee.salary);
		System.out.println(" ");
		System.out.println(applicationContext.isSingleton("employee"));
		
	}

}
