package com.eighth.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	public static void main(String[] args) {
	

		AbstractApplicationContext context=new ClassPathXmlApplicationContext("eighth.xml");
		context.registerShutdownHook();
		BeanMethods m=(BeanMethods)context.getBean("myBean");
		m.displayMsg();
		
	}

	
	
}
