package com.java.test;

public class TestString {

	public static void main(String[] args) {
		String str = new String("https:\\www.bharat.com\bharat\raj");
		int i=0;
		for(byte ch : str.getBytes()) {
			
			System.out.println(""+str.charAt(i++)+" : "+ch);
			if(ch == 8) {
				str = str.replace(str.charAt(i-1), (char)('/'));
			}
		}
		System.out.println(str);
		str = str.replace("\\", "\\");
		System.out.println(str);
		String convertedStr = str.replaceFirst("\\\\", "//");
		convertedStr = convertedStr.replace("\\", "/");
		System.out.println(convertedStr);
	}
}
