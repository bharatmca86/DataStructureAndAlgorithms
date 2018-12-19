package com.java.geeks.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PairWithDiff {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestCases = Integer.parseInt(sc.nextLine().trim());
		for(int t=0; t<noOfTestCases; t++) {	
			int arrLength = Integer.parseInt(sc.nextLine().trim());
			String arr[] = sc.nextLine().trim().split(" ");
			if(arr.length != arrLength){
			    System.out.println("Invalid Array ..");
			}
		    int diff = Integer.parseInt(sc.nextLine());
			//printDiff(arr, diff);
		    System.out.println(findPairs(arr, diff));
		}
	}
	
	public static void printDiff(String[] arr, int diff){
		Set<Integer> set = new HashSet<>();
		int count =0;
		for (String str : arr) {
		    int i = Integer.parseInt(str);
		    if(set.contains(diff+i))
				count++;
		    set.add(i);
		}
		System.out.println(count);
	}
	
	public static int findPairs(String[] nums, int k) {
        if( k < 0 ) 
		 return 0;
				
        HashMap<Integer, Integer> map = new HashMap<>();
        for(String value: nums) {
        	int n = Integer.parseInt(value);
            map.put(n, map.getOrDefault(n,0)+1);
        }
        
        int count =0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        {
           if(map.containsKey(entry.getKey()+k))
           {
               if(entry.getKey()!= (entry.getKey()-k))
                   count++;
               else
               {
                   if(entry.getValue()>1)
                       count++;
               }
            }
           
        }
        return count;
    }
}
