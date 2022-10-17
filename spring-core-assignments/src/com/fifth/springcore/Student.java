package com.fifth.springcore;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Required;


@Resource(name="student")
public class Student {
	
	long id;
	String name;
	
	@Inject
	College college;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	
	public void display() {
		
		System.out.println("Loading Students Information........");
		System.out.println("id- "+ id + "------------- Name- "+name+" ------------College-"+college.collegeName+"------------------Location- "+college.collegeLocation );
	}
	
	
	

}
