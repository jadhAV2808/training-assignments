package com.first.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.second.springcore.Question;

public class Test {
	
	public static void main(String [] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("first.xml");
		Customer cust=(Customer)context.getBean("Customer");
		cust.displayInfo();
		
		
	}

}
