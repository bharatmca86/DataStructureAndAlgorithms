package com.java.geeks.array.slidingwindow;

public class SlidingWindowProblem {

	public static void main(String[] args) {
		int arr[] = {};
		int sum=0;
		int max = 0;
		int k =4;
		for(int i=0; i<arr.length; i++) {
			if((i+1)%k == 0) {
				sum= sum+arr[i];
			}
			
		}
	}
}
