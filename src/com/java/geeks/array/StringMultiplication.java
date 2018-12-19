package com.java.geeks.array;

import java.math.BigInteger;
import java.util.Scanner;

public class StringMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestCases = Integer.parseInt(sc.nextLine().trim());
		for (int t = 0; t < noOfTestCases; t++) {
			String[] str = sc.nextLine().trim().split(" ");
			System.out.println(multiply(str[0], str[1]));
		}
		System.out.println(Thread.currentThread().isDaemon());
	}

	private static String multiply(String str1, String str2) {
		if (!str1.matches("\\d+") || !str2.matches("\\d+"))
		    return "-1";                 
		return new BigInteger(str1).multiply(new BigInteger(str2)).toString();
		
	}
	
}
