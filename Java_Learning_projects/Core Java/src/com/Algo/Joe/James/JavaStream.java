package com.Algo.Joe.James;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {
//loop Strean
	
//2)
	
//Print only half of array
	
//Print Sum of Array

	//String sort and find the firtElement 

	//String sort fitert And Print Exampe startWith s
	
	// Avg of SqAURE OF AN int
	
	//List<STring> filter and Print and Make all to lower case 
	
	
	public static void main(String[] args) throws IOException {
		List<Integer> list=Arrays.asList(1,2,3,4,1,4,5,7,8,9);
		list.forEach((t)->System.out.println(t));                 
		
		List<Integer> li=list.stream().skip(5).collect(Collectors.toList());
		System.out.println(li);
		
		list.stream().sorted((a1,a2)->a1.compareTo(a2));
		
		int k2=list.stream().mapToInt(i->i).sum();
		
		System.out.println(list.stream().sorted((a1,a2)->a1.compareTo(a2)).collect(Collectors.toList()));
		
		List<String> st=Arrays.asList("Deashish","Vijsy","Vijay","Vemal","lalpat");
		
		System.out.println(st.stream().filter((a)->a.startsWith("V"))
				.sorted((a1,a2)->a1.compareTo(a2)).collect(Collectors.toList()));
		
		
		Double d =	list.stream().mapToDouble((t)->t*t).average().getAsDouble();
		System.out.println(d);
		
		String k= st.stream().filter((d2)->d2.startsWith("V")).findAny().get();
		System.out.println(k);
		
		st.stream().map((d3)->d3.toLowerCase()).filter((d4)->d4.startsWith("v")).forEach((t)->System.out.println(t));
		
		
		
		
		
		
		
	}
}
