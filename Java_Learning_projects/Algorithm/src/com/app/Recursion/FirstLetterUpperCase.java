package com.app.Recursion;

public class FirstLetterUpperCase {
	public static char temp =0;
public static void main(String[] args) {
	System.out.println(first("debAshish"));
}
	static char first(String str) {
		if(Character.isUpperCase(str.charAt(str.length()-1))) {
			return str.charAt(str.length()-1);
		}
			return first(str.substring(0, str.length()-1));
    //   TODO
    
    }
}
