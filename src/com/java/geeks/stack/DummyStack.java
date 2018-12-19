package com.java.geeks.stack;

public class DummyStack {

	static final int MAX = 1000;
	int arr[] = new int[MAX];
	int top;
	public DummyStack() {
		top=-1;
	}
	public boolean isEmpty() {
		return top<0;
	}
	
	public void push(int value) {
		if(top>=MAX-1) {
			System.out.println("Stack overFlow ..");
			return;
		}else {
			arr[++top]=value;
			System.out.println("pushed into stack");
		}
		
	}
	
	public int pop() {
		if(top<0) {
			System.out.println("Stack underflow");
			return -1;
		}else {
			return arr[top--];
		}
	}
	
	public static void main(String[] args) {
		DummyStack stack = new DummyStack();
		/*stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);*/
		for(int i=0;i<MAX-1;i++) {
			stack.push(i);
		}
		for(int i=0;i<MAX-1;i++) {
			System.out.println(stack.pop());
		}
		
		
	}
}
