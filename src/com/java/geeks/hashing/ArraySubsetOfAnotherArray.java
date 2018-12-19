package com.java.geeks.hashing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArraySubsetOfAnotherArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestCases = Integer.parseInt(sc.nextLine());
		for(int t=0; t<noOfTestCases; t++) {	
			String[] arrLengths = sc.nextLine().split(" ");
			int fArrLength = Integer.parseInt(arrLengths[0]);
			int sArrLength = Integer.parseInt(arrLengths[1]);
			String fArr[] = sc.nextLine().split(" ");
			String sArr[] = sc.nextLine().split(" ");
			if(fArr.length != fArrLength || sArr.length != sArrLength) {
				System.out.println("Invalid Array ..");
			}
			List<Integer>  fList = Arrays.stream(fArr).map(str -> Integer.parseInt(str)).collect(Collectors.toList());
			List<Integer>  sList = Arrays.stream(sArr).map(str -> Integer.parseInt(str)).collect(Collectors.toList());
			if(fList.containsAll(sList)) {
				System.out.println("Yes");
			}else
				System.out.println("No");
				
	}
	}
}
