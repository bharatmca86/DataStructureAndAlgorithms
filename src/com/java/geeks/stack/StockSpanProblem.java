package com.java.geeks.stack;

import java.util.Stack;

public class StockSpanProblem {

	public static void main(String[] args) {
		int arr[] = {10,5,12,8,7,6,11,16};
		for(int i=0; i<arr.length; i++) {
			int count =1;
			for(int j=i-1; j>=0; j--) {
				if(arr[i] > arr[j]) {
					count++;
				}else {
					break;
				}
			}
			System.out.print(count+",");
		}
		System.out.println();
		StockSpanProblem problem = new StockSpanProblem();
		problem.nextGreaterElement(new int[] {10,5,8,11,3});
	}
	
	public void nextGreaterElement(int arr[]) {
		int[] tempArr = new int[arr.length];
		Stack<Integer> stack = new Stack<>();
		for(int i=arr.length-1; i>=0; i--) {
			if(i==arr.length-1) {
				tempArr[i]=-1;
				stack.push(arr[i]);
			}else {
				if( arr[i]> stack.peek()) {
					tempArr[i]=-1;
					while(!stack.empty() && arr[i]>stack.peek())
						stack.pop();
					stack.push(arr[i]);
				}
				if(arr[i]< stack.peek()) {
					stack.push(arr[i]);
					tempArr[i]=stack.peek();
				}
			}
		}
		for(int i=0; i<tempArr.length; i++)
			System.out.print(tempArr[i]+", ");
	}
}
