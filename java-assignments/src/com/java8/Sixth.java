package com.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.UnaryOperator;

public class Sixth {

	public static void main(String[] args) {
		
		ArrayList<String>list=new ArrayList<>();
		
		list.add("java");
		list.add("junit");
		list.add("spring");
		list.add("python");
		list.add("sql");
		list.add("hibernate");
		list.add("monogodb");
		System.out.println("list contains: "+list);
		list.replaceAll(new UpperCaseConversion());
		System.out.println("result: "+list);
		
	}

}


class UpperCaseConversion implements UnaryOperator<String>{

	@Override
	public String apply(String str) {
		
		return str.toUpperCase();
	}
	
}