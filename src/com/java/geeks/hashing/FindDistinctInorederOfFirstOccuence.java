package com.java.geeks.hashing;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * The Class FindDistinctInorederOfFirstOccuence.
 * @author bharat
 */
public class FindDistinctInorederOfFirstOccuence {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int arr[] = {10,5,5,3,10,8};
		findDistinct(arr);
		countFrequency(arr);
		int arr1[] = {10,-5,5,3,2,8};
		printSum(arr1, 10);
		int arr2[] = {2,3,4,6,7,8,9};
		printSumIfArrayIsSorted(arr2, 10);
	}
	
	/**
	 * Find distinct.
	 *
	 * @param arr the arr
	 */
	public static void findDistinct(int arr[] ){
		Set<Integer> distinct = new LinkedHashSet<>();
		for(int i=0; i< arr.length; i++) {
			distinct.add(arr[i]);
		}
		System.out.println(distinct);
	}
	
	/**
	 * Count frequency.
	 *
	 * @param arr the arr
	 */
	public static void countFrequency(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length; i++) {
			if(!map.containsKey(arr[i]))
				map.put(arr[i], 1);
			else
				map.put(arr[i], map.get(arr[i])+1);
		}
		
		System.out.println(map);
	}
	
	/**
	 * Prints the sum.
	 *
	 * @param arr the arr
	 * @param sum the sum
	 */
	public static void printSum(int[] arr, int sum){
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			if(map.containsKey(sum-i))
				System.out.print(i + " and "+(sum-i));
			else
				map.put(i, sum-i);
		}
	}
	
	public static void printDiff(int[] arr, int diff){
		Map<Integer, Integer> map = new HashMap<>();
		int count =0;
		for (int i : arr) {
			if(map.containsKey(diff+i))
				count++;
			else
				map.put(i, diff+i);
		}
		System.out.println(count);
	}
	
	public static void printSumIfArrayIsSorted(int[] arr, int sum) {
		int left=0, right=arr.length-1;
		while(left<right) {
			if(arr[left]+arr[right] == sum)
				System.out.println("pair found "+arr[left]+", "+arr[right]);
			if(arr[left]+arr[right]>sum) {
				right++;
			}else {
				left++;
			}
		}
		System.out.println("Not found");
	}
}

