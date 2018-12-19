package com.java.geeks.tree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	
	int key;
	Node left, right;
	
	public Node(int x) {
		this.key=x;
		left=right=null;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public int getKey() {
		return key;
	}
	
}

class Pair{
	Node node;
	int level;
	int HD;
	public Pair(Node node, int level) {
		this.node=node;
		this.level = level;
	}
	public Pair(Node node, int level, int HD) {
		this.node=node;
		this.level = level;
		this.HD = HD;
	}
}

public class Tree {
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right= new Node(30);
		root.left.left= new Node(40);
		root.left.right= new Node(50);
		root.right.left = new Node(60);
		root.right.right= new Node(70);
		levelOrderWithLevelNo(root);
		preOrder(root);
		printHDofAllNodes(root);
		/*inOrder(root);
		System.out.println();
		System.out.println();
		postOrder(root);
		System.out.println();
		Node root1= new Node(10);
		root1.left = new Node(6);
		root1.right = new Node(4);
		root1.right.left = new Node(3);
		root1.right.right = new  Node(1);
		System.out.println("is Sum = "+checkChildrenSumProperty(root1));
		
		Node root2= new Node(10);
		root2.left = new Node(9);		
		System.out.println("is Sum = "+checkChildrenSumProperty(root2));
		System.out.println();
		System.out.println("height = "+height(root2));
		levelOrderTraversal(root);
		System.out.println();
		
		//levelOrderLineByLine(root);
		
		System.out.println();*/
	}
	
	public static void inOrder(Node node) {
		if(node==null)
			return;
		inOrder(node.left);
		System.out.print(node.getKey()+" ");
		inOrder(node.right);
		
	}
	
	public static void preOrder(Node node) {
		if(node==null)
			return;
		System.out.print(node.getKey()+" ");
		preOrder(node.left);
		preOrder(node.right);
		
	}
	
	public static void postOrder(Node node) {
		if(node==null)
			return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.getKey()+" ");
		
	}
	
	public static boolean checkChildrenSumProperty(Node node) {
		if(node==null) {
			return true;
		}
		if((node.left != null && node.right==null ) && node.key == node.left.key) {
			return true;
		}
		if((node.left == null && node.right!=null ) && node.key == node.right.key) {
			return true;
		}
		if(node.left ==null && node.right==null)
			return true;
		int sum = 0;
		if(node.left!=null)
			sum+=node.left.key;
		if(node.right!=null)
			sum+=node.right.key;
		if(sum != node.key)
			return false;
		return checkChildrenSumProperty(node.left) && checkChildrenSumProperty(node.right);
	}
	
	public static int height(Node node) {
		if(node==null) {
			return 0;
		}
		int left = height(node.left);
		int right = height(node.right);
		if(left>right)
			return left+1;
		else
			return right+1;
		
	}
	
	public static void levelOrderTraversal(Node node) {
		if(node == null)
			return;
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			Node current = queue.peek();
			queue.remove(current);
			System.out.print(" "+current.key);
			if(current.left!=null)
				queue.add(current.left);
			if(current.right!=null)
				queue.add(current.right);
		}
	}
	
	public static void levelOrderLineByLine(Node node) {
		if(node == null)
			return;
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			Node current = queue.peek();
			int count = queue.size();
			queue.remove(current);
			System.out.print(" "+current.key);
			for(int i=0; i< count; i++) {
				if(current.left!=null)
					queue.add(current.left);
				if(current.right!=null)
					queue.add(current.right);
			}
			System.out.println();
		}
	}
	
	
	
	public static void levelOrderWithLevelNo(Node node) {
		if (node == null)
			return;
		int level = 1;
		Queue<Pair> queue = new LinkedList<>();
		queue.add(new Pair(node, level));
		while (!queue.isEmpty()) {
			Pair current = queue.poll();
			System.out.println(" key = " + current.node.key + " , level = " + current.level);
			level = current.level + 1;
			if (current.node.left != null)
				queue.add(new Pair(current.node.left, level));
			if (current.node.right != null)
				queue.add(new Pair(current.node.right, level));
			System.out.println();
		}
	}

	public static void getLevel(Node node, int x) {

	}
	
	public static void leftView(Node node) {
		
	}
	
	public static void printHDofAllNodes(Node node) {
		if (node == null)
			return;
		int level = 0;
		int HD = 0;
		Queue<Pair> queue = new LinkedList<>();
		queue.add(new Pair(node, level));
		while (!queue.isEmpty()) {
			Pair current = queue.poll();
			System.out.println(" key = " + current.node.key + " , level = " + current.level+", HD="+HD);
			level = current.level+1;
			HD = current.HD;
			if (current.node.left != null)
				queue.add(new Pair(current.node.left, level, HD-1));
			if (current.node.right != null)
				queue.add(new Pair(current.node.right, level, HD+1));
			System.out.println();
		}
	}
	
}
