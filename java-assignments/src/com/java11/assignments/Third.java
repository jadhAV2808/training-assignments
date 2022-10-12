package com.java11.assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Third {

	public static void main(String[] args) {
		
		String str="A quick brown fox jumps over the lazy dog";
		
		
		List<String>l=str.lines().collect(Collectors.toList());
		System.out.println("List : "+l);
		
		String[] arr=l.stream().
				toArray( size -> new String[size]);
		System.out.println("Array : "+Arrays.toString(arr));
		
		
	}

}
