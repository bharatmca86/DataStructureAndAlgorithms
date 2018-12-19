package com.java.geeks.array;

import java.util.Objects;
import java.util.Scanner;

public class StringRemovalAndSameCharAtFirstAndLast {

	public static void main(String[] args) {
		String s = "gskdgsksll";
		char[] charArr = s.toCharArray();
		int count =0;
		/*for (int i=0, j=charArr.length-1; i<charArr.length/2;i++,j--) {
				if(charArr[i] == charArr[j])
					count++;
				else
					s.toString();
		}*/
		Scanner sc = new Scanner(System.in);
		int noOfTestCases = Integer.parseInt(sc.nextLine().trim());
		for (int t = 0; t < noOfTestCases; t++) {
			String str = sc.nextLine().trim();
			reverseString(str);
		}
		
	}
	
	public static void reverseString(String str) {
		if(Objects.isNull(str)) {
			System.out.println("-1");
		}
		if(str.indexOf(".")==-1) {
			System.out.println(str);
		}else {
			String s[] = str.split("\\.");
			StringBuilder builder = new StringBuilder();
			for (int i=s.length-1; i>=0; i--) {
				builder.append(s[i]).append(".");
			}
			System.out.println(builder.substring(0, builder.length()-1));
		}
		
	}
}
