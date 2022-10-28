package com.lamda.Stream.Reduce;

import java.util.Arrays;
import java.util.List;

public class ReducerMain {
public static void main(String[] args) {
	List<Integer>  list=Arrays.asList(1,3,2,4,6,7,4,6);
	
	int k=list.stream().reduce((a,b)->a+b).get();
	System.out.println(k);
	
	System.out.println(list.stream().reduce((a,b)->a>b?a:b).get());
	//System.out.println(list.stream().reduce(null));
	
	List<String> listString=Arrays.
			asList("debashish","raha","Vikram","asdadsa");
	
String name=listString.stream().reduce((a,b)->a.length()>b.length() ? a:b).get();
}
}
