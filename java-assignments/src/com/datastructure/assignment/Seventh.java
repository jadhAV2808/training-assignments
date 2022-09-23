package com.datastructure.assignment;

public class Seventh {

	public static void main(String[] args) {
		
		int[] arr= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int search_value=19;
		int index=0;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search_value) {
				flag=true;
				index=i;
				break;
			}
			
		}
		
		if(flag) {
			System.out.print(" FOUND AT POSITION "+(index+1));
		}
		else {
			System.out.print("NOT FOUND!!!!");
		}
	}

}
