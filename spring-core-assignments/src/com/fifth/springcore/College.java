package com.fifth.springcore;

import javax.annotation.Resource;

@Resource(name="college")
public class College {

	String collegeName;
	String collegeLocation;
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeLocation() {
		return collegeLocation;
	}
	public void setCollegeLocation(String collegeLocation) {
		this.collegeLocation = collegeLocation;
	}
	
	
	
	
}
