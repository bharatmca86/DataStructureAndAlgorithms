package com.java.geeks.array;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60,70};
		int n =arr.length-1;
		int key=100;
		System.out.println("index is : "+search(arr, 0, n, key));
	}

	private static int search(int[] arr, int low, int high, int key) {
		if(low>high)
			return -1;
		int mid = (low+high) / 2;
		if (key == arr[mid]) {
			return mid;
		}else if (key < arr[mid]) {
			return search(arr, low, mid-1, key);
		}else if(key > arr[mid]){
			return search(arr, mid+1, high, key);
		}else {
			System.out.println("not found");
			return -1;
		}
	}
}
