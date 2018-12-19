package com.java.geeks.dp;

import java.util.Arrays;

public class DynamicProgramming {

	static int memo[]= new int[46]; 
	
	
	public static void main(String[] args) {
		Arrays.fill(memo, -1);
		System.out.println(maxCount(45, 2, 13, 7));
	}
	
	static int maxCount(int n, int a, int b, int c) {
		if(memo[n]!=-1) {
			return memo[n];
		}
		if(n==0)
			memo[n]=0;
		if(n<0)
			return -1;
		int resA = maxCount(n-a, a, b, c);
		int resB = maxCount(n-b, a, b, c);
		int resC = maxCount(n-c, a, b, c);
		int res = Math.max(Math.max(resA, resB), resC);
		if(res==-1)
			return -1;
		else
			return res+1;
	}
}
