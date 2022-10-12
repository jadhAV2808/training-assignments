package com.junit.first;

import static org.junit.Assert.*;

import org.junit.Test;

import com.junit.first.MinMaxFinder;

public class MinMaxFinderTest {

	@Test
	public void test1() {
		//("Not yet implemented");
		
		MinMaxFinder mf=new MinMaxFinder();
		int[] arr= {1,3,7,3,4,5};
		int []actual=mf.finders(arr);
		int[]expected= {1,7};
		assertArrayEquals(expected,actual);
		
	}
	
	
	@Test
	public void test2() {
		//("Not yet implemented");
		
		MinMaxFinder mf=new MinMaxFinder();
		int[] arr= {12,33,47,35,43,5};
		int []actual=mf.finders(arr);
		int[]expected= {5,47};
		assertArrayEquals(expected,actual);
		
	}
	
	@Test
	public void test3() {
		//("Not yet implemented");
		
		MinMaxFinder mf=new MinMaxFinder();
		int[] arr= {15,93,7,3,84,15};
		int []actual=mf.finders(arr);
		int[]expected= {3,93};
		assertArrayEquals(expected,actual);
		
	}
	
	
	
	/*
	 * Second questions test cases
	 */
	@Test
	public void secontTest1() {
		
		MinMaxFinder mf=new MinMaxFinder();
		int[]arr= {23,34,56,78,45,12};
		Object[] actual=mf.findSecond(arr);
		Object[] expected= {12,78};
		assertArrayEquals(expected,actual);
	}
	
	@Test
	public void secontTest2() {
		
		MinMaxFinder mf=new MinMaxFinder();
		int[]arr= {3,4,6,8,4,12};
		Object[] actual=mf.findSecond(arr);
		Object[] expected= {3,12};
		assertArrayEquals(expected,actual);
	}
	
	@Test
	public void secontTest3() {
		
		MinMaxFinder mf=new MinMaxFinder();
		int[]arr= {34,6,2,1,4,78};
		Object[] actual=mf.findSecond(arr);
		Object[] expected= {1,78};
		assertArrayEquals(expected,actual);
	}

}
