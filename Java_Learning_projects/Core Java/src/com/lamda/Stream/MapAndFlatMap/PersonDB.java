package com.lamda.Stream.MapAndFlatMap;

import java.util.*;

public class PersonDB {

	public static List<Person> getAllData(){
		List<Person> p=new ArrayList<>();
		Person p1=new Person();
		p1.setId(10);
		p1.setName("Rajesh");
		List<String> phNo1=new ArrayList<>();
		phNo1.add("9835533678");
		phNo1.add("7864488765");
		p1.setPhoneNumber(phNo1);
		
		
		Person p2=new Person();
		p2.setId(20);
		p2.setName("Brejesh");
		List<String> phNo2=new ArrayList<>();
		phNo2.add("66889967587");
		phNo2.add("55998872809");
		p2.setPhoneNumber(phNo2);
		
		p.add(p1);
		p.add(p2);
		
		return p;
		
	}
}
