package com.java.geeks.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PairsWithPositiveNegativeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestCases = Integer.parseInt(sc.nextLine().trim());
		for (int t = 0; t < noOfTestCases; t++) {
			int arrLength = Integer.parseInt(sc.nextLine().trim());
			String arr[] = sc.nextLine().trim().split(" ");
			if(arrLength != arr.length)
				System.out.println("Invalid Array..");
			Integer[] intArr = new Integer[arr.length];
			for (int i=0; i<arr.length; i++) {
				intArr[i]= Integer.parseInt(arr[i]);
			}
			//Arrays.sort(intArr, Comparator.comparingInt(Math::abs));
			Arrays.sort(intArr, (a,b) -> (Integer.compare( Math.abs(a),  Math.abs(b))));
			Set<Integer> set = new HashSet<>(Arrays.asList(intArr));
			boolean anyPairFound = false;
			for (int value : intArr) {
				if (set.contains(-(value))) {
					System.out.print(value + " " + (-value) + " ");
					set.remove(value);
					//set.remove(-value);
					anyPairFound =true;
				}
			}
			if(!anyPairFound)
				System.out.println("0");
		}
	}
}
