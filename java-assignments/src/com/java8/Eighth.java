package com.java8;

import java.util.ArrayList;
import java.util.List;

public class Eighth {

	public static void main(String[] args) {
		
		List<Integer>list=new ArrayList<>();
		
		list.add(23);
		list.add(34);
		list.add(43);
		list.add(56);
		list.add(78);
		list.add(90);
		list.add(87);
		
		Thread myThread=new Thread(()->System.out.println(list));
		
		myThread.run();
		
	}

}
