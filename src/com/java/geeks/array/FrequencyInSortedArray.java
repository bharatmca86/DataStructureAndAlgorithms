package com.java.geeks.array;

public class FrequencyInSortedArray {

	public static void main(String[] args) {
		int arr[] = {1,2,2,2,8,9,10};//output like 3 for input 2
		int x=2;
		
		
	}
	
	public int findFirstOccurence(int[] arr, int low, int high, int key){
		if(low>high)
			return -1;
		int mid = (low+high) / 2;
		if (key == arr[mid]) {
			return mid;
		}else if (key < arr[mid]) {
			return findFirstOccurence(arr, low, mid-1, key);
		}else if(key > arr[mid]){
			return findFirstOccurence(arr, mid+1, high, key);
		}else {
			System.out.println("not found");
			return -1;
		}
	}
}
