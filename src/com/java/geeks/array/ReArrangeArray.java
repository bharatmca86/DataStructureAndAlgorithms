package com.java.geeks.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReArrangeArray {

	public static void main(String[] args) {
		int arr[] = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
	              11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			if(set.contains(i))
				arr[i]=i;
			else
				arr[i]=-1;
		}
		System.out.println(Arrays.toString(arr));
	}
}
