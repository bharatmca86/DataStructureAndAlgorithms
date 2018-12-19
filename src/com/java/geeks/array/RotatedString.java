package com.java.geeks.array;

import java.util.Scanner;

public class RotatedString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestCases = Integer.parseInt(sc.nextLine().trim());
		for (int t = 0; t < noOfTestCases; t++) {
			String str1 = sc.nextLine().trim();
			String str2 = sc.nextLine().trim();
			findRotatedString(str1, str2);
		}
	}
	
	public static void findRotatedString(String str1, String str2) {
		String conStr = str1+str1;
		if(str1.length() == str2.length() && conStr.contains(str2))
			System.out.println("1");
		else
			System.out.println("0");
	}
}
