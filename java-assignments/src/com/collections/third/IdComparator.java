package com.collections.third;

import java.util.Comparator;

public class IdComparator implements Comparator<Employees>{


	public int compare(Employees e1, Employees e2) {
		
		return e1.getId()-(e2.getId());
	}
}
