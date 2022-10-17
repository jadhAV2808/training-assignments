package com.fifth.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.second.springcore.Question;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("fifth.xml");
		Student student=(Student)context.getBean("student");
		
		student.display();
		
		
	}

}
