package com.java.geeks.tree.heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class BinaryHeap {

	public static void main(String[] args) {
		
		int arr[] = { 10, 8, 9, 5, 18, 15 };

		int k = 3;
		kLargestElements(arr, k);
	}

	static void  kLargestElements(int arr[], int k) {
		Queue<Integer> pq = new PriorityQueue<>(k);
		for (int value : arr) {
			pq.offer(value);
			if(value > pq.peek())
				pq.poll();
		}
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}

}
