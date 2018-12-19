package com.java.geeks.array;

public class EqualibriumPoint {

	public static void main(String[] args) {
		int arr[] = {-1,2,-1,-1};//{10,5,3,6,1};
		
		System.out.println(equalibriumPoint(arr));
	}
	
	public static int equalibriumPoint(int[] arr) {
		int sum=0, leftSum=0;
		for(int i=0; i<arr.length;i++) {
			sum+=arr[i];
		}
		
		for(int i=0; i<arr.length; i++) {
			sum=sum-arr[i];
			if(sum==leftSum)
				return i;
			leftSum += arr[i];
		}
		return -1;
	}
}
