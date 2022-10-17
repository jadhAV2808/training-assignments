package com.seventh.springcore;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("SPEL Hello World---");
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp = parser.parseExpression("'Hello World'");
		String message =  (String)exp.getValue();
		System.out.println(message);

		System.out.println(" ");
		
		System.out.println("SPEL conatenation---");
		ExpressionParser parser1 = new SpelExpressionParser();
		Expression exp1 = parser1.parseExpression("'Welcome To'.concat('SpringExpression')");
		String message1 = (String) exp1.getValue(); System.out.println(message1);

		
        System.out.println(" ");
		
		System.out.println("SPEL byte connversion---");	
		ExpressionParser parser2 = new SpelExpressionParser();
		Expression exp2 = parser2.parseExpression("'Hello Abhi'.bytes"); 
		byte[] bytes = (byte[]) exp2.getValue();
		for(int i=0;i<bytes.length;i++) {
		  System.out.print(bytes[i]+" "); 
		}
		
		
	    System.out.println(" ");
	    System.out.println(" ");
	    System.out.println("SPEL Uppercase connversion---");	  
		ExpressionParser parser3 = new SpelExpressionParser();
		Expression exp3 = parser3.parseExpression("new String('hello world').toUpperCase()");
		String message3 = exp3.getValue(String.class);
		System.out.println(message);

		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("SPEL length calculation---");	  
		ExpressionParser parser4 = new SpelExpressionParser();
		Expression exp4 = parser4.parseExpression("'Hello Abhi'.bytes.length");  
		int length = (Integer) exp4.getValue();  
		System.out.println(length); 

		
		
	}

}
