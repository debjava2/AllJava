package com.app.Recursion;

public class BinaryToDecimal {
	static String temp="";
 public static void main(String[] args) {
	StringBuilder br=new StringBuilder(convert(28));
	System.out.println(br.reverse());
}
 public static String convert(int a) {
	 if(a==0)
	return temp;
	return temp+a%2+convert(a/2);
 }
}
