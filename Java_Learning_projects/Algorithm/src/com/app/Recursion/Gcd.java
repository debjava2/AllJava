package com.app.Recursion;

public class Gcd {
	static int temp=0;
public static void main(String[] args) {
	int a=4;
	int b=126;
	if(a<b) {
	temp=a;
	a=b;
	b=temp;
	}
	System.out.println(gcdOf(a,b));
}
public static int gcdOf(int a ,int b) {
	
if(b==0)
	return a;

return gcdOf(b,a%b);
	
}
}
