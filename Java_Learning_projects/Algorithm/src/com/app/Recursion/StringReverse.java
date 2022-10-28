package com.app.Recursion;

public class StringReverse {
		public static String temp="";
		public static void main(String[] args) {
			System.out.println(reverse("Deb"));
		}
	 public static String reverse(String str)
	    {
		 if(str.length()==0)
		 return temp;
		 return temp+str.charAt(str.length()-1)+reverse(str.substring(0, str.length()-1));
	    }
}
