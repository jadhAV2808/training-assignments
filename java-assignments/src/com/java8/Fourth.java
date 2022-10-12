package com.java8;

import java.util.ArrayList;
import java.util.List;

public class Fourth {

	public static void main(String[] args) {
		
		List<String>list=new ArrayList<>();
		list.add("pooja");
		list.add("jeet");
		list.add("kirti");
		list.add("rani");
		list.add("radha");
		list.add("pakhi");
		list.add("saii");
		list.add("ram");
		list.add("lucky");
		
		list.removeIf(word->word.length()%2 !=0);
		list.forEach(System.out::println);
		
	}

}
