package com.java11.assignments;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class Fourth {

	public static void main(String[] args) {
		
		
		var path="C:\\Users\\PJADHA20\\Desktop\\assisgnments\\Java11Assignments_StudentList.txt";
		
		try {
			String line;
			int count=0;
			
			String data=Files.readString(Path.of(path));
			
			System.out.println(data);
		
			
			
			String[] names=data.split(" ");
			count=count+names.length;
			System.out.println(count);
			
			
		}  
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
