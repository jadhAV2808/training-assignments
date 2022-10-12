package com.collections.third;

import java.util.Comparator;

public class NameComparator  implements Comparator<Employees>{


	public int compare(Employees e1, Employees e2) {
		
		return e1.getName().compareTo(e2.getName());
	}
}
