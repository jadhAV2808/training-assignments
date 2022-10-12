package com.collections;

import java.util.HashSet;

public class Second {

	public static void main(String[] args) {
		
		HashSet<Integer> hashSet=new HashSet<>();
		hashSet.add(12);
		hashSet.add(22);
		hashSet.add(12);
		hashSet.add(45);
		hashSet.add(67);
		hashSet.add(12);
		hashSet.add(67);
		hashSet.add(12);
		hashSet.add(56);
		hashSet.add(67);
		hashSet.add(12);
		
		System.out.println("All the unique values are:-");
		
		System.out.println(hashSet);
		
	}

}
