package com.java.geeks.linkedlist;

public class LinkedListOperations {
	
	Node head;
	Node tail;
	
	public LinkedListOperations() {
		head = new Node();
		tail = new Node();
	}
	

	public void insertAtBeg(int x){
		Node node = new Node(x);
		Node temp = head.getNext();
		node.setNext(temp);
		head.setNext(node);
	}
	public void insert(int x) {
		Node node = new Node(x);
		Node temp = head;
		if(temp.getNext() == null) {
			temp.setNext(node);
		}
		
		tail = node;
	}
	public void findMiddle() {
		if(head.getNext() == null) {
			System.out.println("Empty linked list");
			return;
		}
		
		if(head.getNext().getNext() == null) {
			System.out.println(head.getNext().getData());
			return;
		}
		Node fastPointer = head;
		Node slowPointer = head;
		while(fastPointer.getNext() != null) {
			fastPointer = fastPointer.getNext().getNext();
			slowPointer = slowPointer.getNext();
		}
		
		System.out.println("Middle element = "+slowPointer.getData());
	}
	public static void main(String[] args) {
		LinkedListOperations linkedListOperations = new LinkedListOperations();
		linkedListOperations.insert(10);
		linkedListOperations.insert(20);
		linkedListOperations.insert(30);
		linkedListOperations.insert(40);
		linkedListOperations.insert(50);
		linkedListOperations.findMiddle();
	}
}
