package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

class FourthTest {
	
	Fourth f;
	
	@Test
	void addTest() {
		int actual=f.add(1, 2);
		int expected=3;
		assertEquals(expected,actual);
	}
	
	@Test
	void subtractTest() {
		int actual=f.subtract(10, 2);
		int expected=8;
		assertEquals(expected,actual);
	}
	
	@Test
	void multiplyTest() {
		int actual=f.multiply(12, 10);
		int expected=120;
		assertEquals(expected,actual);
	}
	
	@Test
	void divideTest() {
		int actual=f.divide(10, 2);
		int expected=5;
		assertEquals(expected,actual);
	}
	
	@BeforeEach
	void init() {
		 f=new Fourth();
		
	}
	
	@BeforeAll
	static void beforeAllIniit() {
		System.out.println("this needs to run before all...");
	}
	
	@AfterAll
	static void afterAllIniit() {
		System.out.println("this needs to run after all...");
	}
	
	@AfterEach
	void cleanup()
	{
		System.out.println("Cleaning Up.....");
	}
	
	
	
	
}
