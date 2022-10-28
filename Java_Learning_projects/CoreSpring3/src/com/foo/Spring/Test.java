package com.foo.Spring;

import java.io.IOException;

class X{
	public void call() throws IOException {
		throw new IOException();
	}
}
public class Test {
public static void main(String[] args) {
	StringBuffer sb=new StringBuffer(500);
	String s="";
	System.out.println(sb.toString().equals(s));
}
}
