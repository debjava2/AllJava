package com.app.Recursion;

public class RecursiveMethod {
	public static void main(String[] args) {
		new RecursiveMethod().recursiveI(5);
	}
public void  recursiveI(int data) {
	if(data<1) {
		System.out.println("n is less then 1");
	}
	else {
		recursiveI(data-1);
		System.out.println(data);
	}
}
}
