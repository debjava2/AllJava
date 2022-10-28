package com.lamda.Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
//Checking Consumer  Interface
	
	public static void main(String[] args) {
		Consumer<Integer> consumer=(Integer t)->System.out.println(t);
		List<Integer> list=Arrays.asList(1,3,4,6,7,8);
		//list.forEach(consumer);
		//System.out.println(consumer.accept(list)); Error 
		List a=new ArrayList();
		list.forEach((t)->a.add(t));
	}
}
