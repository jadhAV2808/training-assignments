package com.collections;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class Fourth {

	public static void main(String[] args) {
	
		LocalDate localdate=LocalDate.of(2020, 8, 10);
		
		List<LocalDate> calenderList = new LinkedList<>();
		calenderList.add(localdate);
		calenderList.add(LocalDate.of(2021, 11, 19));
		
		for(LocalDate l:calenderList) {
			
			String formattedDate=
					l.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			if(l.isLeapYear())
				System.out.println(formattedDate +" is a leap year!!");
			else
				System.out.println(formattedDate +" is NOT a leap year!!");
			
		}
		
	}

}
