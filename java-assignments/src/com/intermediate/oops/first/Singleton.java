package com.intermediate.oops.first;

public class Singleton {

	private static Singleton s=new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getSingleton() {
		return s;
	}
}
