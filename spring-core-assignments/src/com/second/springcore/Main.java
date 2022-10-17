package com.second.springcore;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.first.springcore.Customer;

public class Main {

	public static void main(String[] args) {
		
/*1--first list approach
		ApplicationContext context=new ClassPathXmlApplicationContext("second.xml");
		List<String> list=(List<String>)context.getBean("list-of-answers");
		System.out.println();
		System.out.println("List of answers: "+list);
		
		*/
		
		ApplicationContext context=new ClassPathXmlApplicationContext("second.xml");
		Question que=(Question)context.getBean("questionlist");
		
		System.out.println(que.questionId +".] " +que.question);
		
		que.displayAnswerList();
		
		System.out.println("------------------------------------------------------");
		
		que.displayAnswerSet();
		
		System.out.println("------------------------------------------------------");
		
		que.displayAnswerMap();
		
		System.out.println("------------------------------------------------------");
		
		que.displayQuestionAnswer();
		
		
		
	}

}
