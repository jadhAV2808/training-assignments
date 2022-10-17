package com.tenth.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("tenth.xml");
		EmpExForAppContextAware emp=(EmpExForAppContextAware)context.getBean("appicationContextAware");
		emp.displayEmpDetails();;
		
	}

}
