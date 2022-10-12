package com.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test{
	
	String str();
	
}
public class First {

	@Test(str="Test Annotation")
	public void testCase() {
		
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		First f=new First();
		Method m=f.getClass().getMethod("testCase");
		Test t=m.getAnnotation(Test.class);
		System.out.println(t.str());
		
	}

}
