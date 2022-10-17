package com.ninth.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context=new ClassPathXmlApplicationContext("ninth.xml");
		context.registerShutdownHook();
		BeanLifeCycle cycle=(BeanLifeCycle)context.getBean("lifecycle");
		cycle.display();
	}

}
