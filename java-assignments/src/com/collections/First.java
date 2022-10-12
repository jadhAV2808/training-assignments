package com.collections;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class First {

	public static void main(String[] args) {
		
		Map<Long,Contact>treeMap=new TreeMap<Long,Contact>();
		
		Contact c1=new Contact(9567785421L,"puja","puja@gmail.com",com.collections.Contact.gender.F);
		Contact c2=new Contact(9567785423L,"ravi","ravi@gmail.com",com.collections.Contact.gender.M);
		Contact c3=new Contact(5674385421L,"ram","ram@gmail.com",com.collections.Contact.gender.M);
		Contact c4=new Contact(9564335621L,"savi","savi@gmail.com",com.collections.Contact.gender.F);
		
		treeMap.put(12348L, c4);
		treeMap.put(16787L, c3);
		treeMap.put(17664L, c2);
		treeMap.put(56434L, c1);
		
		Map<Long,Contact> sortedMapDesc=new TreeMap<>(Collections.reverseOrder());
		sortedMapDesc.putAll(treeMap);
		
		for(Map.Entry<Long,Contact>entry1:sortedMapDesc.entrySet()) {
			
			Long key=entry1.getKey();
			Contact c=entry1.getValue();
			
			//All keys are
			System.out.println(key+" ");
			
			//All Values 
			System.out.println(c.name+" "+ c.email+" "+c.phoneNumber+" "+c.g);
			
			System.out.println(" ");
		}
	}

}


class Contact{
	
	long phoneNumber;
	String name,email;
	enum gender {F,M}
	gender g;
	public Contact(long phoneNumber, String name, String email, gender g) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.email = email;
		this.g = g;
	}
	
	
}
