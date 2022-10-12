package com.string.assignments;

public class Third {

	public static void main(String[] args) {
		
		String str="Java String pool refers to collection of Strings which are stored in a memory.";
		
		String a=str.toLowerCase();
		System.out.println(a);
		System.out.println("-----------------------------------------");
		
		String b=str.toUpperCase();
		System.out.println(b);
		System.out.println("-----------------------------------------");
		
		String c=str.replace("a"," $");
		System.out.println(c);
		System.out.println("-----------------------------------------");
		
		
		if(str.contains("collection"))
			System.out.println("YES");
		
		else
			System.out.println("NO");
		
		System.out.println("-----------------------------------------");
		
		
		String str2="java string pool refers to collection of strings which are stored in a memory.";
		
		if(str.contentEquals(str2))
			System.out.println("Match Found!!");
		else
			System.out.println("NO Match Found!!");

		System.out.println("-----------------------------------------");
		
		if(str.equalsIgnoreCase(str2)) 
			System.out.println("Match Found after Ignoring the case!!");
		else
			System.out.println("NO Match Found after Ignoring the case!!");

		
	}

}
