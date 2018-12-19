package com.java.geeks.array;

/**
 * 0000
 * 0111 - > output row
 * 0000
 * 0011
 * @author bharat
 *
 */
public class FindMaxOccurenceRow {

	public static void main(String[] args) {
		int arr[][] = {{0,0,0,1},{0,1,1,1}, {0,0,0,0}, {0,0,1,1}};
		for (int[] matrix : arr) {
			System.out.println(findFirstOccurence(matrix, 0, 3, 0));
		}
	}
	
	public static int findFirstOccurence(int arr[], int low, int high, int count) {
		if(low>high)
			return -1;
		int mid=low+high/2;
		if(arr[mid] == 1) {
			count++;
			findFirstOccurence(arr, low, mid-1, count);
		}
		else {
			findFirstOccurence(arr, mid+1, high, count);
		}
		return count;
	}
}

