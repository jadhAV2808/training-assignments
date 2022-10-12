package com.collections.third;

import java.util.Comparator;

public class DeptComparator implements Comparator<Employees>{


	public int compare(Employees e1, Employees e2) {
		
		return e1.getDepartment().compareTo(e2.getDepartment());
	}
}
