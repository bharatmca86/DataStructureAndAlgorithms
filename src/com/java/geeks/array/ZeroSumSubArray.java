package com.java.geeks.array;

import java.util.HashMap;
import java.util.Map;

public class ZeroSumSubArray {

	public static void main(String[] args) {
		int arr[] = {2,6,-5,4,1,9};
		System.out.println(isThereAnyZeroSumArray(arr, 0));
		int arr1[] = {10,2,3,1,8};
		System.out.println(isThereAnyZeroSumArray(arr1, 6));
	}
	
	public static boolean isThereAnyZeroSumArray(int arr[], int x ){
		int sum=0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
			if(sum==x || arr[i]==x || map.get(sum)!=null)
				return true;
			map.put(sum, i);
		}
		return false;
	}
}
