package com.junit.fourth;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleTest {

	@Test
	void displayTest() {
		Sample s=new Sample();
		String actual=s.display("Hello World!");
		String expected="Hello World!";
		assertEquals(actual,expected);
	}
	
	
	@Test
	void addTest() {
		Sample s=new Sample();
		int actual = s.add(20, 30);
		int expected=50;
		assertEquals(actual,expected);
	}
	
	
	 void SampleTest() {
		System.out.println("Constructor");
	}
	
	@BeforeAll
	 static void beforeAllTest() {
		System.out.println("BeforeAll annotation testing");
		
	}
	
	@AfterAll
	 static void afterAllTest() {
		System.out.println("AfterAll annotation testing");
	}
	
	@BeforeEach
	 void beforeEachTest() {
		System.out.println("BeforeEach annotation testing");
	}
	
	
	@AfterEach
	 void afterEachTest() {
		System.out.println("AfterEach annotation testing");
	}
	

}
