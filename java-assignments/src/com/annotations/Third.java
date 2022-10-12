package com.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Execute{
	int sequence();
}

public class Third {
	
	@Execute(sequence=2)
	public void method1() {
		System.out.println("Hello from method1");
	}
	
	@Execute(sequence=1)
	public void method2() {
		System.out.println("Hello from method2");
	}
	
	@Execute(sequence=3)
	public void method3() {
		System.out.println("Hello from method3");
	}

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Third third=new Third();
		
		Method[] methods=third.getClass().getMethods();
		for(Method method:methods) {
			
			Execute exe=method.getAnnotation(Execute.class);
			
			if(exe!=null) {
				method.invoke(third);
			}
		}
	}

}
