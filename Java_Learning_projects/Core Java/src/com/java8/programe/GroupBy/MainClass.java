package com.java8.programe.GroupBy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "Raj", "Mechanical", true, 25000,"Male",24,"2015"));
		list.add(new Employee(2, "Bipin", "Mechanical", true, 35000,"Male",32,"2016"));
		list.add(new Employee(3, "Prakash", "Electrical", false, 45000,"Male",30,"2014"));
		list.add(new Employee(4, "Vikash", "Electrical", true, 37000,"Male",25,"2015"));
		
		list.add(new Employee(4, "Suman", "Electrical", true, 27000,"FeMale",32,"2017"));
		list.add(new Employee(4, "Rani", "Mechanical", true, 38000,"FeMale",33,"2016"));
		list.add(new Employee(4, "Raxsihta", "Electrical", false, 42000,"FeMale",30,"2016"));
		

		Map<String, List<Employee>> emp = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList()));
		System.out.println(emp);

		//emp.entrySet().forEach(k -> k.getValue().forEach(a -> System.out.println(a.getName())));

		Map<String, Long> emp1 = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		
		System.out.println(emp1);

		//emp1.entrySet().forEach(m -> System.out.println(m.getKey() + " " + m.getValue()));
		
		Map<Boolean, List<Employee>> empk=	list.stream().collect(Collectors.groupingBy(Employee::isStatus,Collectors.toList()));
	//	empk.forEach((k,v)->System.out.println(k+" "+v));
		
	
		List<Employee> amp=list.stream().filter((a)->{
			if(a.isStatus()==true) {
				return true;
			}else {
				return false;
			}
		}).collect(Collectors.toList());
		
		Employee a =list.stream().max(Comparator.comparing(Employee::getSalary)).get();
		//System.out.println(a);
		
		//
		
		//list.stream().collect(Collectors.groupingBy(Employee::getDepartment),Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary))));

		Map<String, Optional<Employee>> emp32=list.stream().collect(Collectors.groupingBy(Employee::
			getDepartment,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
		System.out.println(emp32);
		
		Map<String, Long> emp22=list.stream().collect(Collectors.groupingBy(Employee::getSex,Collectors.counting()));
		
		emp22.forEach((k,v)->System.out.println(k+"   "+v));
		
		
		Map<String, List<Employee>> ted =list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.toList()));
		
		/*
		 * ted.forEach((k,v)->{ System.out.println(k);
		 * v.forEach((am)->System.out.println(am.getName()));
		 * 
		 * });
		 */
		Map<String, Double> abbb=list.stream().collect(Collectors.groupingBy(Employee::getSex,Collectors.averagingInt(Employee::getAge)));
//		/abbb.forEach((k,v)->System.out.println(k+"   "+v));
		
		//get the name of the employee who join after 2015
		
		Stream<String> ab=list.stream().filter((b)->Integer.parseInt(b.getYear())>2015).map(Employee::getName);
		
		//ab.forEach((c)->System.out.println(c));
		
	}
}
