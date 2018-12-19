package com.java.geeks.array;

public class ReverseNumericArray {

	
	public static void main(String[] args) {
		int  arr[] = {1, 2, 3,4,5,6,7,8,9};
		System.out.println("iterative output...");
		usingIterativeApproach(arr);
		System.out.println("\nRecursive output...");
		int  arr2[] = {1, 2, 3};
		int startIndex = 0, lastIndex=arr2.length-1;
		usingRecursiveApproach(arr2, startIndex, lastIndex);
	}

	private static void usingIterativeApproach(int[] arr) {
		int startIndex = 0, lastIndex=arr.length-1;
		while(startIndex!=lastIndex) {
			int temp = arr[lastIndex];
			arr[lastIndex] = arr[startIndex];
			arr[startIndex]=temp;
			startIndex++;
			lastIndex--;
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	private static void usingRecursiveApproach(int[] arr, int startIndex, int lastIndex) {		
		int temp = arr[lastIndex];
		arr[lastIndex] = arr[startIndex];
		arr[startIndex] = temp;
		startIndex++;
		lastIndex--;
		if(startIndex!=lastIndex)
			usingRecursiveApproach(arr, startIndex, lastIndex);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

}
