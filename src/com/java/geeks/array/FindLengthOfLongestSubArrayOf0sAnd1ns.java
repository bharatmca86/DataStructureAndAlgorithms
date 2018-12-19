package com.java.geeks.array;

import java.util.HashMap;
import java.util.Map;
//TODO
public class FindLengthOfLongestSubArrayOf0sAnd1ns {

	public static void main(String[] args) {
		int arr[] = {1,0,0,1,1,1,0,1,1};
		longestSubArray(arr);
	}
	
	public static void longestSubArray(int arr[]){
		Map<Integer, Integer> data = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(data.containsKey(arr[i])) {
				data.put(arr[i], data.get(arr[i])+1);
			}
			else {
				data.put(arr[i], 1);	
			}
		}
		if(data.get(0) == data.get(1))
			System.out.println("equal");
		else {
			int diff = data.get(0) - data.get(1);
			System.out.println("");
		}
	}
}
