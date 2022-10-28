package com.lamda.Supplier;

import java.util.function.Supplier;

/*
 * public class SupplierDemo implements Supplier<String> {
 * 
 * @Override public String get() { // TODO Auto-generated method stub return
 * "Hello World"; }
 * 
 * public static void main(String[] args) { SupplierDemo ob=new SupplierDemo();
 * System.out.println(ob.get()); }
 * 
 * }
 */
public class SupplierDemo{
	
	
	 public static void main(String[] args) {
		Supplier<String> supplier=()->"Hello World";
		System.out.println(supplier.get());
	}
}