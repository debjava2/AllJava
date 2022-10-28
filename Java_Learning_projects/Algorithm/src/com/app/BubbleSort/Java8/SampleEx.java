package com.app.BubbleSort.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface Sam{
	int addTwoSum(int a,int b);
}
public class SampleEx {
public static void main(String[] args) {
	Sam call=(a,b)->a+b;
	System.out.println(call.addTwoSum(10, 20));
	
	List<String> list=Arrays.asList("Deb","Raj","Summit");
	
	
	list.forEach((String t)->System.out.println(t));
}
}
