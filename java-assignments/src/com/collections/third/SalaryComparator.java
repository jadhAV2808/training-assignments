package com.collections.third;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employees>{


	public int compare(Employees e1, Employees e2) {
		
		return (int) (e1.getSalary()-e2.getSalary());
	}
}