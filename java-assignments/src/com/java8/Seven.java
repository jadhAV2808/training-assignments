package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Seven {

	public static void main(String[] args) {
		
		Map<String , String>map=new HashMap<>();
		map.put("Shyam", "Sunder");
		map.put("Shruti", "Vyas");
		map.put("Lizza", "Messi");
		map.put("Nilima", "Chavan");
		map.put("Laata", "Didi");
		
		
		String result=map.entrySet()
				.stream()
				.map((entry)->entry.getKey()+"-"+entry.getValue())
				.collect(Collectors.joining(" , "));
		
		System.out.println(result);
		
	}

}
