package com.lamda.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer2 {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,3,4,6,7,8,10);
	Consumer<List<Integer>> consumer=(t)->System.out.println(t);
	
	
	consumer.accept(list);
	//System.out.println(list);
	list.forEach((t)->System.out.println(t));
	
	
}
}
