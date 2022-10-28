package com.app.Recursion;

public class RecursiveRange {
	public static void main(String[] args) {
		System.out.println(recursiveRange(6));
	}
	 public static int recursiveRange(int num) {
		if(num==1)
			return 1;
		return num+recursiveRange(num-1);
		    //  TODO
		   }
}
