package com.lamda.Stream.FilterAndForEach;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterItem {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(2,3,5,6,8,98,36,55,47);
	List<Integer> list2=list.stream().filter((t)-> t%2==0).collect(Collectors.toList());
	
	System.out.println(list2);
	List<String> some=Arrays.asList("Aman","Duggask","kisosera","altimat")
						.stream().filter((a)->a.startsWith("a")).collect(Collectors.toList());
	System.out.println(some);
	List<Integer> li=list.stream().map((i)->i*4).collect(Collectors.toList());
	System.out.println(li);
	
	System.out.println(list.stream().max((a,b)->a>b?a:b));
	
}
}
