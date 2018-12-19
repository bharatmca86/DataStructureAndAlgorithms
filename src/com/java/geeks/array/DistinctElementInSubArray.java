package com.java.geeks.array;

import java.util.HashSet;
import java.util.Set;

public class DistinctElementInSubArray {

	public static void main(String[] args) {
		int arr[] = {1,3,1,3,2,3,4,1};
		int k=3;
		Set<Integer> set= new HashSet<>();
		int loopIncrementor = 1;
		for(int i=loopIncrementor;i<=arr.length; i++) {
			if(i%k==0) {
				System.out.println(set.size());
				set.clear();
			}
			set.add(arr[i-1]);
			if(i == arr.length && loopIncrementor < arr.length-k) {
				i=++loopIncrementor;
			}
		}
	}
	
	
}
