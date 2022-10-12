package com.junit.first;

public class MinMaxFinder {

	int[]arr=new int[] {56,34,7,3,34,53};
	public  int[] finders(int []arr) {
		
		//int[]arr=new int[] {56,34,7,3,34,53};
		
		
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			else if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		
		int[] result= {min,max};
		
		return result;
		
		//System.out.println(min+ " , "+max);
		
	}
	
	
	//second question
	public Object[] findSecond(int [] arr) {
		int min=arr[0], max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
			if(arr[i]>max)
				max=arr[i];
		}
		
		Object result[]= {min,max};
		
		return result;
	}
}
