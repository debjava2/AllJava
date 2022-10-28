package com.app.Recursion;

public class Power {
 public static void main(String[] args) {
	int a= power(2,4);
	System.out.println(a);
}
 public static int power(int base,int exp) {
	 if(exp==0) {
		 return 1;
	 }
	 return base*power(base,exp-1);
 }
}
