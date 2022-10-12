package com.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Info{
	
	int  authorId();
	String name();
	String supervisor();
	String date();
	String time();
	String version();
	
}

public class Second {

	@Info(authorId=101,name="Shikha",supervisor="priya",date="29/09/2022",time="16:23:45 hrs",version="2.4.5")
	public void display() {
		System.out.println("Getting information from @Info Annotation...........");
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		Second second=new Second();
		second.display();
		
		Method m=second.getClass().getMethod("display");
		
		Info info=m.getAnnotation(Info.class);
		
		System.out.println("Author ID----------"+info.authorId());
		System.out.println("Author name--------"+info.name());
		System.out.println("supervisor name----"+info.supervisor());
		System.out.println("date---------------"+info.date());
		System.out.println("Time---------------"+info.time());
		System.out.println("Version------------"+info.version());
		
	}

}
