package com.java.geeks.string;

public class Anagrams {

	public static void main(String[] args) {
		String str1 = "gEe ks";
		String str2 = "gkeE s";
		System.out.println(isAnagrams(str1, str2));
		
		System.out.println(isSubsequence("xyz", "sxuuyfz"));
	}
	
	public static boolean isAnagrams(String str1, String str2) {
		if(str1.length() != str2.length())
			return false;
		else {
			int[] countStr1 = new int[256];
			int[] countStr2 = new int[256];
			for(int i=0 ; i<str1.length(); i++) {
				countStr1[str1.charAt(i)]++;
			}	
			for(int i=0 ; i<str2.length(); i++) {
				countStr2[str2.charAt(i)]++;
			}	
			for(int i=0; i<countStr1.length; i++) {
				if(countStr1[i] != countStr2[i])
					return false;
			}
			return true;
		}
	}
	
	public static boolean isSubsequence(String str1, String str2) {
		 int index=0;
		 for(int i=1; i<str1.length(); i++) {
			 int preIndex = str2.indexOf(str1.charAt(i-1));
			 index = str2.indexOf(str1.charAt(i));
			 if(index == -1){
				 return false;
			 }
			 if(index < preIndex) {
				 return false;
			 }
			 
		 }
	 return true;
	}
}
