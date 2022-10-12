package com.stream;

public class Trader {

	String name,city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public Trader() {
		super();
		
	}
	
	
}
