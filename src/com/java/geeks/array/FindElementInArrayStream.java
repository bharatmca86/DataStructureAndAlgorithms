package com.java.geeks.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * Given a sorted stream (size is not knowsn) , find if an element is present
 * arr[] = {10,23,4,5,5,6,,,7,7,...}
 * x=35
 * O/p = Yes
 * Jump to the power of 2 and then binary search
 * @author bharat
 *
 */
public class FindElementInArrayStream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestCases = Integer.parseInt(sc.nextLine());
		for(int t=0; t<noOfTestCases; t++) {	
			int dimension = Integer.parseInt(sc.nextLine());
			String[] arr = sc.nextLine().split(" ");
			if(arr.length != dimension*dimension) {
				System.out.println("Not a valid input array ..");
				return;
			}
			Set<Integer> resultSet  = new HashSet<>();			
			int start = 0, last=dimension;
			for(int i=0; i<dimension ; i++) {
				Set<Integer> result = new HashSet<>();
				for(int j=start; j<last ;j++) {
					int value = Integer.parseInt(arr[j]);
					if(i==0)
						resultSet.add(value);
					else {
						result.add(value);
					}
				}
				Iterator<Integer> itr = resultSet.iterator();
				Set<Integer> temp = new HashSet<>(resultSet);
				while(itr.hasNext()) {
					int value = itr.next();
					if(!result.contains(value)) {
						itr.remove();
					}
				}
				resultSet = temp;
				start=start+dimension;
				last=last+dimension;
			}
	    
			System.out.println(resultSet);
		}
		sc.close();
	}
	
	public void find(int[] arr, int x) {
		
	}
}
