package com.app.Recursion;

public class Palindrome {
	public static String temp = "";

	public static void main(String[] args) {

	}

	public static boolean reverse(String str) {
		if (str.length() == 0)
			return strtemp;
		return temp + str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
	}
}
