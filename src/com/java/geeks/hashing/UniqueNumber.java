package com.java.geeks.hashing;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int noOfTestCases = Integer.parseInt(sc.nextLine());
		for(int t=0; t<noOfTestCases; t++) {	
			String[] arrLengths = sc.nextLine().trim().split(" ");
			if(arrLengths.length !=2)
				System.out.println("-1");
			int start = Integer.parseInt(arrLengths[0]);
			int end = Integer.parseInt(arrLengths[1]);
			
			Set<Integer> set = new HashSet<>();
			for(int i =start; i<=end; i++) {
				int n=i;
				boolean isNotUnique=false;
				while(n>0) {
					int m = n%10;
					if(set.contains(m)) {
						isNotUnique=true;
						break;
					}
					set.add(m);
					n = n/10;
				}
				set.clear();
				if(!isNotUnique)
					System.out.print(i+" ");
				
			}
			System.out.println();
		}
		sc.close();
	}
}
