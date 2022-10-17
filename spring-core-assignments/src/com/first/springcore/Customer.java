package com.first.springcore;

public class Customer {
	
	private int customerId;
	private String customerName;
	private long customerContact;
	private Address address;
	
	/*
	 * this is for setter injection 
	 */
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	/*
	 * this is for constructor injection 
	 */
	public Customer(int customerId, String customerName, long customerContact, Address address) {
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.address = address;
	}
	
	
	
	public void displayInfo() 
	
	{
		
		System.out.println("Customer Id ----------- ---"+this.customerId);
		System.out.println("Customer Name --------- ---"+this.customerName);
		System.out.println("Customer contact --------- "+this.customerContact);
		System.out.println("Customer Address --street: "+this.address.street+
				                   " city: "+this.address.city +
				                   " state: "+this.address.state+
				                   " zip: "+this.address.zip +
				                   " country: "+this.address.country);
		
	
	}

	

}
