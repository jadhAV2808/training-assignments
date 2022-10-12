package com.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
		
		/*
		 * list of fruits
		 */
		List<Fruits>fruitList=new ArrayList<>();
		
		fruitList.add(new Fruits("Apple",100,150,"red"));
		fruitList.add(new Fruits("Banana",90,50,"yellow"));
		fruitList.add(new Fruits("PineApple",10,102,"brown"));
		fruitList.add(new Fruits("Guava",50,10,"Green"));
		fruitList.add(new Fruits("watermelon",40,10,"green"));
		fruitList.add(new Fruits("Apple",100,10,"red"));
		
		/*
		 * list of news
		 */
		List<News>newsList=new ArrayList<>();
		
        newsList.add(new News(101, "Ravi", "Raju", "Nice"));
        newsList.add(new News(102, "Malli", "Ravi", "Good"));
        newsList.add(new News(103, "Vinay", "Malli", "Budget"));
        newsList.add(new News(104, "vinay", "Vinay", "Budget"));
        newsList.add(new News(105, "Chandu", "Pranith", "Nice"));

		
        /*
		 * list of traders
		 */
		List<Trader>traderList=new ArrayList<>();
		
		traderList.add(new Trader("Walmart", "Banglore"));
        traderList.add(new Trader("Jim", "Pune"));
        traderList.add(new Trader("John", "indore"));
        traderList.add(new Trader("Steven", "Delhi"));
        traderList.add(new Trader("Richad", "Delhi"));
        traderList.add(new Trader("Richad", "Pune"));

        
            /*
      		 * list of transactions
      		 */
      		List<Transaction>transactionList=new ArrayList<>();
      		
      		transactionList.add(new Transaction(new Trader("Walmart", "Banglore"), 2011,250));
      		transactionList.add(new Transaction(new Trader("Jim", "Pune"), 2018,1200));
      		transactionList.add(new Transaction(new Trader("John", "indore"), 2011,950));
      		transactionList.add(new Transaction(new Trader("Richad", "delhi"), 1999,450));

      		/*
      		 * Question no.1
      		 */
      		System.out.println("displaying names of the low calories fruits i.e."
      				+"\n calories<100 sorted in descending order");
      		
      		List<String>lowCaloriesFruits=
      				fruitList.stream()
      				.filter(f->f.getCalories()<100)
      				.map(t->t.getName()).sorted(Collections.reverseOrder())
      				.collect(Collectors.toList());
      		
      		System.out.println(lowCaloriesFruits);
      		System.out.println("-------------------------------------------------------------");
      		
      		/*
      		 * Question 2
      		 */
      		System.out.println("Colorwise list of fruit names: ");
      		for(Fruits fruit:fruitList) {
      			System.out.println(fruit.getColor()+"------"+fruit.getName());
      		}
      		System.out.println("-----------------------------------------------------------------------");
      		
      		/*
      		 * Question 3
      		 */
      		System.out.println("Display only RED color fruits sorted as per their price in Ascending Order");
      		
      		List<Fruits>redFruits=fruitList.stream()
      				.filter(e->e.getColor().equalsIgnoreCase("red"))
      				.sorted(Comparator.comparing(Fruits::getPrice))
      				.collect(Collectors.toList());
      		
      		for(Fruits fruit:redFruits) {
      			System.out.println(fruit.getName()+"------"+fruit.getColor()+"-----------"+fruit.getCalories()+"--------------"+fruit.getPrice());
      		}
   
      		System.out.println("---------------------------------------------------------------------------");
      		
      		/*
      		 * Question 4
      		 */
      		System.out.println();
      		System.out.println("--------------------------------------------------------------------------------------");
      		
      		/*
      		 * Question 5
      		 */
      		System.out.println("Hoe many times the word budgets arrived in commnets");
      		Long count= newsList.stream()
      				.filter(e->e.getComment().equalsIgnoreCase("budget")).count();
      		System.out.println("the count of word budget: "+count);
      		System.out.println("------------------------------------------------------------------------");
      		
      		/*
      		 * Question 6
      		 */
      		System.out.println("finding which user has posted maximum comments : ");
      		/*
      	  Optional<String> user = newsList.stream().max(Comparator.comparing(News::getPostedByUser))
      			  .map(News::getPostedByUser);
      	 System.out.println(user.get());
      	 System.out.println("----------------------------------------------------");
      	 */
      	 
      	 /*
      	  * Question 7
      	  */
         System.out.println("display commnetedByUser wise number of commnets :");
         System.out.println("----------------------------------------------------");
         
         /*
          * Question 8
          */
         System.out.println("transaction in 2011 and sort by value small to large");
         transactionList.stream().filter(n->n.getYear()==(2011))
         .sorted((p1,p2) -> p1.getValue()-p2.getValue())
         .forEach(p-> System.out.println(p.getTrader().getName()+" "+p.getValue()));
         System.out.println("---------------------------------------------------------------------------------------------");
         
         /*
          * Question 9
          */
         System.out.println("unique cities where traders work");
         
         traderList.stream().map(Trader::getCity).distinct()
         .forEach(System.out::println);
         System.out.println("--------------------------------------------------------");
         
         /*
          * Question 10
          */
         System.out.println("traders from pune sorted by name");
         
         List<Trader> sortedNames = traderList.stream()
        		 .filter(e -> e.getCity().equalsIgnoreCase("pune"))
        		 .sorted(Comparator.comparing(Trader::getName))
        		 .collect(Collectors.toList());;
         //System.out.println(sortedNames);
        		 for(Trader t:sortedNames) {
           			System.out.println(t.getName());
           		}

        System.out.println("--------------------------------------------------------------");

      		/*
      		 * Question 11
      		 */
        System.out.println("Return a String of all traders’ names sorted alphabetically.");
        
        List<String> stringList = traderList.stream().map(Trader::getName).sorted().collect(Collectors.toList()); 
        stringList.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------------");
        
        /*
         * Question 12
         */
        System.out.println("Are any traders based in indore?");
        
        List<Trader> indoreList= traderList.stream().filter(e -> e.getCity().equalsIgnoreCase("indore")).collect(Collectors.toList()); 
        
        for(Trader t:indoreList) {
   			System.out.println(t.getName());
   		}

        System.out.println("---------------------------------------------------------------------------");

        /*
         * Question13
         */
      		
        System.out.println("Print all transactions value from the traders living in Delhi.");
        
        List<Transaction> delList=transactionList.stream().filter(n->n.getTrader().getCity().equalsIgnoreCase("Delhi")).collect(Collectors.toList()); 
        //.forEach(pr->System.out.println(pr.getTrader().getName()+" "+pr.getValue()+" "+pr.getYear()));
       
        for(Transaction tr:delList) {
   			System.out.println(tr.getTrader().getName()+"     "+tr.getValue()+"    "+tr.getYear());
   		}
        
        System.out.println("-----------------------------------------------------------------");
		/*
		 * Question 14
		 */
        System.out.println("What’s the highest value of all the transactions?");
        
        Optional<Integer> max=transactionList.stream().map(n->n.getValue()).max((v1,v2) -> v1.compareTo(v2));
        System.out.println(max.get());

        System.out.println("--------------------------------------------------------------");
        
        /*
         * Question 15
         */
        
        System.out.println("Find the transaction with the smallest value.");
        
        Optional<Integer> min=transactionList.stream().map(n->n.getValue()).min((v1,v2) -> v1.compareTo(v2));
        System.out.println(min.get());

        
	}
	
}
