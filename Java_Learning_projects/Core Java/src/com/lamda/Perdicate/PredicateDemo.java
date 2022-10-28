package com.lamda.Perdicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
public static void main(String[] args) {
	/*
	 * Predicate<Integer> predicate=(Integer t)->{ if(t%2==0) return true; else
	 * return false; };
	 */
	
	
	Predicate<Integer> predicate =(t)->t%2==0;
	
	//System.out.println(predicate.test(5));
	List<Integer> list=Arrays.asList(1,3,4,6,7,8);
	
	list.stream().filter(predicate).forEach((t)->{
		System.out.println("Pront "+t);
		list.remove(t);
		
	});
}

}
