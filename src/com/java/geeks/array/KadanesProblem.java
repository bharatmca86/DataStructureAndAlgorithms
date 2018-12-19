package com.java.geeks.array;

import java.util.Arrays;

public class KadanesProblem {

	public static void main(String[] args) {
		int arr[] = {-2,-3,4,-1,-2,1,5,-3,10};
		maxFrequency(arr);
		int arr1[] = {2,4,2,2,4,3,3,4,4,4,4};
		findAmzorityElement(arr1);
	}

	private static void maxFrequency(int[] arr) {
		int sum=0, max_sum=0;
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
			if(sum<0)
				sum=0;
			if(sum>max_sum)
				max_sum=sum;
		}
		System.out.println(max_sum);
	}
	
	public static void findAmzorityElement(int arr[] ){
		Arrays.sort(arr);
		int n = arr.length/2;		
		int element = arr[n];
		if(arr[0] == element || arr[arr.length-1] == element) {
			System.out.println("Mazority ELement is "+element);
		}
		else {
			System.out.println("No mazority element.");
		}
	}
	
	public static void markMatrixElementOne(int arr[][]){
		
	}
}

