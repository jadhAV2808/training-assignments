package com.junit.second;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SecondTest {

	
	
	@Test
	void minMaxFinderTest1() {
		
		Second sec=new Second();
		int [] arr= {1,24,5,6,7,89,90};
		Object [] actual= sec.minMaxFinder(arr);
		Object [] expected= {1,90};
		assertArrayEquals(expected,actual);  
	}
	
	@Test
	void minMaxFinderTest2() {
		
		Second sec=new Second();
		int [] arr= {13,4,5,67,7,9,78};
		Object [] actual= sec.minMaxFinder(arr);
		Object [] expected= {4,78};
		assertArrayEquals(expected,actual);  
	}

	
	@Test
	void minMaxFinderTest3() {
		
		Second sec=new Second();
		int [] arr= {1,4,5,6,7,65,30};
		Object [] actual= sec.minMaxFinder(arr);
		Object [] expected= {1,65};
		assertArrayEquals(expected,actual);  
	}


}
