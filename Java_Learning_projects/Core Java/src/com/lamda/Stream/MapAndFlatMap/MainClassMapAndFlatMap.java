package com.lamda.Stream.MapAndFlatMap;

import java.util.*;
import java.util.stream.Collectors;

public class MainClassMapAndFlatMap {
/*
 * FlatMap and Map
 */
	
public static void main(String[] args) {
	List<Person> person=PersonDB.getAllData();
	
	List<String> name=person.stream()
			.map(p->p.getName()).collect(Collectors.toList());
	
	System.out.println(name);
	
	List<String> phNo=person.stream()
			.flatMap(p->p.getPhoneNumber().stream()).collect(Collectors.toList());
	System.out.println(phNo);
			
	
}
}
