package com.generics;

import java.util.HashMap;

public class Second {

	public static void main(String[] args) {
		
		HashMap<Integer,Double> map=new HashMap<>();
		map.put(101, 110.15);
		map.put(102, 120.25);
		map.put(103, 130.35);
		map.put(104, 140.45);
		map.put(105, 150.55);
		map.put(106, 160.65);
		map.put(107, 170.75);
		map.put(108, 180.85);
		map.put(109, 190.95);
		map.put(110, 200.50);
		
		System.out.println("map size is:- "+map.size());
		System.out.println();
		System.out.println(map);
	}

}
