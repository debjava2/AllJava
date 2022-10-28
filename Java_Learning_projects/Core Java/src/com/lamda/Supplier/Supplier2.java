package com.lamda.Supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Supplier2 {
public static void main(String[] args) {
	Supplier<String> st= ()->  "adadasd";
	
	System.out.println(st.get());
	
	List<String> list=Arrays.asList("a","b");
	//String k=list.stream().findAny().orElseGet(st);
	list.stream().findAny().orElseGet(()->  "adadasd");
}
}
