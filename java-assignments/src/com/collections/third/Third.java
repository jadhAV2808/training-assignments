package com.collections.third;

import java.util.Scanner;
import java.util.TreeSet;

public class Third {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println
		("you want to sort in order of \n\n1.ID\n2.Department\n3.Name\n4.Salary\n\n Enter options");
		
		int option=sc.nextInt();
		
		switch(option) {
		
		case 1:
			TreeSet<Employees>emp=new TreeSet<Employees>(new IdComparator());
			
			emp.add(new Employees(202,"Shyam Sunder","Electronics",80000));
			emp.add(new Employees(101,"Rati Shah","Finance",50000));
			emp.add(new Employees(221,"Shweta Shinde","Technical",60000));	
			emp.add(new Employees(231,"Ram Mohan","HR",50000));	
			emp.add(new Employees(234,"Alok Nath","Mechanical",90000));
			
			System.out.println("sorted by Id :");
			for(Employees e:emp) {
				System.out.println(e.getId() +"-------"+e.getName()+"-----"+e.getDepartment()+"-------"+e.getSalary());
			}	
			
			break;
			
		case 2:
			TreeSet<Employees>emp1=new TreeSet<Employees>(new DeptComparator());
			
			emp1.add(new Employees(202,"Shyam Sunder","Electronics",80000));
			emp1.add(new Employees(101,"Rati Shah","Finance",50000));
			emp1.add(new Employees(221,"Shweta Shinde","Technical",60000));	
			emp1.add(new Employees(231,"Ram Mohan","HR",50000));	
			emp1.add(new Employees(234,"Alok Nath","Mechanical",90000));
			
			System.out.println("sorted by Department :");
			for(Employees e:emp1) {
				System.out.println(e.getId() +"-------"+e.getName()+"-----"+e.getDepartment()+"-------"+e.getSalary());
			}	
			
			break;
		case 3:
			TreeSet<Employees>emp2=new TreeSet<Employees>(new NameComparator());
			
			emp2.add(new Employees(202,"Shyam Sunder","Electronics",80000));
			emp2.add(new Employees(101,"Rati Shah","Finance",50000));
			emp2.add(new Employees(221,"Shweta Shinde","Technical",60000));	
			emp2.add(new Employees(231,"Ram Mohan","HR",50000));	
			emp2.add(new Employees(234,"Alok Nath","Mechanical",90000));
			
			System.out.println("sorted by NAme :");
			for(Employees e:emp2) {
				System.out.println(e.getId() +"-------"+e.getName()+"-----"+e.getDepartment()+"-------"+e.getSalary());
			}	
			
			break;	
			
		case 4:
			TreeSet<Employees>emp3=new TreeSet<Employees>(new SalaryComparator());
			
			emp3.add(new Employees(202,"Shyam Sunder","Electronics",80000));
			emp3.add(new Employees(101,"Rati Shah","Finance",50000));
			emp3.add(new Employees(221,"Shweta Shinde","Technical",60000));	
			emp3.add(new Employees(231,"Ram Mohan","HR",50000));	
			emp3.add(new Employees(234,"Alok Nath","Mechanical",90000));
			
			System.out.println("sorted by Salary :");
			for(Employees e:emp3) {
				System.out.println(e.getId() +"-------"+e.getName()+"-----"+e.getDepartment()+"-------"+e.getSalary());
			}	
			
			break;
			
			
			
		}	
	}

}

