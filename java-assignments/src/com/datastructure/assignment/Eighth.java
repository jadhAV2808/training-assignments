package com.datastructure.assignment;

public class Eighth {

	public static void main(String[] args) {


		int[] arr= {15,12,17,87,19,1,23,26,35,37,7,53,86,41};
		int temp=0;
		for(int j=0;j<arr.length;j++)
		for(int i=1;i<arr.length-j;i++) {
			temp=arr[i-1];
			if(arr[i-1]>arr[i]) {
				arr[i-1]=arr[i];
				arr[i]=temp;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +",");
		}

	}

}
