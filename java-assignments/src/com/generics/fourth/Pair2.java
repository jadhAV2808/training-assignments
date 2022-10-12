package com.generics.fourth;

import java.util.Date;
import java.util.HashMap;

public class Pair2 {

	public static void main(String[] args) {
		
		HashMap<String,Date> map=new HashMap<>();
        map.put("Today is", new java.util.Date());
        System.out.println(map);

	}

}
