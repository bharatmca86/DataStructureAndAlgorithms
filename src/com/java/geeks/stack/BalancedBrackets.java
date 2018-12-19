package com.java.geeks.stack;

import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		Stack<Character> stack = new Stack();
		String str = "(([])){}";
		char[] chars = str.toCharArray();
		for (char c : chars) {
			stack.push(c);
		}
		for (char c : chars) {
			if(c=='(') {
				stack.push(c);
			}
			if(c == ')' && stack.peek() == '(') {
				stack.pop();
			}else if(c == '}' && stack.peek() == '{') {
				stack.pop();
			}else if(c == ']' && stack.peek() == '[') {
				stack.pop();
			}
		}
		
		if(stack.isEmpty()) {
			System.out.println("balanced");
			
		}else {
			System.out.println("not balanced");
		}
	}
}
