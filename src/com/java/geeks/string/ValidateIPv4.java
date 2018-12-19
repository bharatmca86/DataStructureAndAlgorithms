package com.java.geeks.string;

import java.util.Scanner;

public class ValidateIPv4
{

	
	public static boolean isValidInet4Address(String s) {
		final String IPV4_REGEX =
				"^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
						"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
						"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
						"(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
		
		final java.util.regex.Pattern IPV4_PATTERN = java.util.regex.Pattern.compile(IPV4_REGEX);
		if (s == null) {
			return false;
		}
		String[] arr = s.split("\\.");
		if(arr.length != 4) {
			return false;
		}
		if((arr[0].startsWith("0") && arr[0].length()>1) || (arr[1].startsWith("0") && arr[1].length()>1) || (arr[2].startsWith("0") && arr[2].length()>1)
				|| (arr[3].startsWith("0") && arr[3].length()>1))
			return false;
		java.util.regex.Matcher matcher = IPV4_PATTERN.matcher(s);
		
		if (matcher.matches()) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int noOfTestCases = Integer.parseInt(sc.nextLine().trim());
		for (int t = 0; t < noOfTestCases; t++) {
			String ipAddress = sc.nextLine().trim();
			System.out.println(isValidInet4Address(ipAddress));
		}
		sc.close();
	}
}