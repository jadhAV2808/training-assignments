package com.ninth.springcore;

public class BeanLifeCycle {

	String lifecycleString;
	
	
	public void display() {
		System.out.println(lifecycleString);
	}
	
	
	public String getLifecycleString() {
		return lifecycleString;
	}

	public void setLifecycleString(String lifecycleString) {
		this.lifecycleString = lifecycleString;
	}

	public void myInit() {
		System.out.println("myInit method called for triangle");
	}
	
	public void myDestroy() {
		System.out.println("myDestroy method called for triangle");
	}

	
}
