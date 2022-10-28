package com.lamda.Stream.FilterAndForEach;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class FilterAndForEach {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("murratdfsfsfsdf");
		list.add("jhonesdfsds");
		list.add("vokashsdfsd");
		list.add("rakeshsd");
		
		list.forEach((t)->System.out.println(t));
		list.stream().forEach((k)->System.out.println(k));
		
		list.stream().
		filter((k)->k.startsWith("ra")).forEach((m)->System.out.println(m));
		
		
		List<String> bb=list.stream().filter((k)->k.length()>10).collect(Collectors.toList());
		
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		
		map.entrySet().stream().forEach(obj->System.out.println(obj));
		map.forEach((k,v)->System.out.println(k+" "+v));
		
		Predicate<String> p=new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		list.stream().filter((t)->t.startsWith("m")).forEach((t)->System.out.println(t));
		//list2.forEach((t)->System.out.println(t));
	
	}
}
