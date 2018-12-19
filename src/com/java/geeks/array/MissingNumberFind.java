package com.java.geeks.array;

import java.util.Scanner;

public class MissingNumberFind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestCases = Integer.parseInt(sc.nextLine().trim());
		for(int t=0; t<noOfTestCases; t++) {	
			int arrLength = Integer.parseInt(sc.nextLine().trim());
			String arr[] = sc.nextLine().trim().split(" ");
			System.out.println(findMissingNo(arr, arrLength));
		}
		sc.close();
	}

	private static int findMissingNo(String[] arr, int arrLength) {		
		int expectedSum = arrLength*(arrLength+1)/2;
		int actualSum =0;
		for (String string : arr) {
			actualSum = actualSum + Integer.parseInt(string);
		}
		return expectedSum-actualSum;
		
	}
}

