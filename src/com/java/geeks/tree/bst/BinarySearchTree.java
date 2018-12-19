package com.java.geeks.tree.bst;

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

public class BinarySearchTree {

	public Node insert(Node root, int key) {
		if(root== null) {
			root= new Node(key);
			return root;
		}
		if(key < root.key) {
			root.left =insert(root.left, key);
		}else {
			root.right =insert(root.right, key);
		}
		return root;
	}
	
	public Node delete(Node root, int key) {
		if(root== null) {
			return null;
		}
		if(root.key == key) {
			root=null;
		}
		if(key < root.key) {
			root.left =delete(root.left, key);
		}else {
			root.right =delete(root.right, key);
		}
		return root;
	}
	
	public boolean isBinarySearchTree(Node node, int min, int max) {
		if(node== null) {
			return true;
		}
        if (node.key < min || node.key > max) 
            return false; 
        return (isBinarySearchTree(node.left, min, node.key-1) && 
        		isBinarySearchTree(node.right, node.key+1, max)); 
	}
	
	public void convertToLinkedList(Node root, int min , int max) {
		
	}
	
	public boolean hasSumPath(Node root, int sum, int currentSum) {
		if(root==null)
			return false;
		currentSum = currentSum+root.key;
 		if(isLeaf(root) && sum == currentSum)
			return true;
		return hasSumPath(root.left, sum, currentSum) || hasSumPath(root.right, sum, currentSum);
	}
	private boolean isLeaf(Node root) {
		return root.left==null && root.right==null;
	}

	public void maxSumPath(Node root, int maxSum, int currentSum) {
		if(root==null) {
			System.out.println("max sum = "+maxSum);
		}
		currentSum= currentSum+root.key;
		if(isLeaf(root) && currentSum > maxSum) {
			maxSum = currentSum;
		}
		maxSumPath(root.left, maxSum, currentSum);
		maxSumPath(root.right, maxSum, currentSum);
		
	}
	int ans = 0;
	public int findDiameter(Node root){
		if(root==null)
			return 0;
		int lh = hieght(root.left);
		int rh = hieght(root.right);
		 ans = Math.max(ans, 1+lh+rh);
		 findDiameter(root.left);
		 findDiameter(root.right);
		 return ans;
	}
	
	public boolean checkIfHeightBalancedTree(Node root){
		if(root==null)
			return true;
		int lh = hieght(root.left);
		int rh = hieght(root.right);
		if(Math.abs(lh-rh) >= 1)
			return false;
		return checkIfHeightBalancedTree(root.left) && checkIfHeightBalancedTree(root.right);
	}
	private int hieght(Node node) {
		if(node == null)
			return 0;
		return 1 + Math.max(hieght(node.left), hieght(node.right));
	}

	public static void main(String[] args) {
		BinarySearchTree searchTree = new BinarySearchTree();
		Node root = new Node(10);
		root.left = new Node(5);
		root.right= new Node(20);
		searchTree.insert(root, 30);
		searchTree.insert(root, 40);
		inOrder(root);
		
		System.out.println(searchTree.isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
		
		System.out.println("Sum is = "+searchTree.hasSumPath(root, 8, 0));
		
		//System.out.println("max sum = "+searchTree.maxSumPath(root, 0, 0));
		System.out.println("diameter = "+searchTree.findDiameter(root));
		System.out.println("is height balanced = "+searchTree.checkIfHeightBalancedTree(root));
		
	}
	
	public static void inOrder(Node node) {
		if(node==null)
			return;
		inOrder(node.left);
		System.out.print(node.getKey()+" ");
		inOrder(node.right);
		
	}
}
