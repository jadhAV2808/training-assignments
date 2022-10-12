package com.java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Third {

	public static void main(String[] args) {
		
		//consumer functional interface.
		Consumer<Product>updatePrice= p->p.setPrice(10.150);
		
		Product p=new Product();
	    updatePrice.accept(p);
	    p.printPrice();
	    
	    
		//predicate functional interface
	    Predicate<String>isLarge=t->t.length()>10;
	    String str="Predicate is having only test method";
	    boolean result=isLarge.test(str);
	    System.out.println("this is Predicate funtional interface---"+result);
	    
	    
	    //Function functional interface
	    Function<Integer,Double> half=a->a/2.0;
	    System.out.println("this is Function functional inerface's output: "+half.apply(20));
	    
	    //Supplier functional inerface
	    Supplier<Double>randomValue=()->Math.random();
	    System.out.println("Supplier functional inerface "+randomValue.get()*100);
	}

}

class Product{
	
	private double price=0.0;

	public void setPrice(double price) {
		this.price = price;
	}

	public void printPrice() {
		System.out.println("This is consumer functional interface: "+price);
	}
	
	
}