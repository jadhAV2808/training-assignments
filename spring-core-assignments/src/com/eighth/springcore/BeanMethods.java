package com.eighth.springcore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanMethods  implements InitializingBean , DisposableBean {

	
String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void displayMsg() {
		System.out.println(message);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean distroy method called!");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("InitializingBean init method called ");
		
	}
	
	public void myInit() {
		System.out.println("myInit method called ");
	}
	
	public void myDestroy() {
		System.out.println("myDestroy method called ");
	}

	
	@PostConstruct 
	public void initBeanMethods() {
		System.out.println("PostConstructs annotation");
	}
	
	@PreDestroy
	public void destroyBeanMethods() {
		System.out.println("PreDestroy annotation");
	}
	
	
}

