package com.lamda.Stream.Sort.MAP;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.lamda.Stream.Project.Employee;

public class SortMapDemo {
public static void main(String[] args) {
	Map<String,Integer> map=new HashMap<>();
	map.put("eight", 8);
	map.put("four", 4);
	map.put("ten", 10);
	map.put("two", 2);
	
	List<Entry<String, Integer>> entry=(new ArrayList<>(map.entrySet()));
	Collections.sort(entry,(o1,o2)->o1.getKey().compareTo(o1.getKey()));
	
	List<Entry<String, Integer>> st=map.entrySet().stream()
			.sorted(Map.Entry.comparingByKey()).collect(Collectors.toList());
	
	st.forEach((k)->System.out.println(k));
	
	List<Entry<String, Integer>> st2=map.entrySet().stream()
			.sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
	
	
	st2.forEach((k)->System.out.println(k));
	
	
	map.entrySet().stream()
			.sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	
	
	Map<Employee,Integer> employeeMap=new TreeMap<>((o1,o2)->o1.getSalary()-o1.getSalary());
	employeeMap.put(new Employee(178, "Rohasna", "IT",60000 ), 60);
	employeeMap.put(new Employee(388, "Bikash", "CIVIL",80000 ), 90);
	employeeMap.put(new Employee(470, "BIMAL", "defence",50000 ), 50);
	employeeMap.put(new Employee(678, "Sourav", "core",40000 ), 40);
	
	employeeMap.entrySet().stream()
	.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDepartment)))
	.forEach((k)->System.out.println(k));
	
	
	//employeeMap.entrySet().stream().sorted()
}
}
