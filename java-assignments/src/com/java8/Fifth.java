package com.java8;

import java.util.List;
import java.util.function.Consumer;

public class Fifth {

	public static void main(String[] args) {
		
		var list=List.of("apples","bananas","mangoes","grapes","pineapple");
		
		
		
		list.forEach(
				new Consumer<String>() {
					public void accept(String str) {
						StringBuilder sb=new StringBuilder();
						for(String s:str.split(" ")) {
							sb.append(s.charAt(0));
						}
						System.out.print(sb.toString());
					}
				}
				);
	}

}
