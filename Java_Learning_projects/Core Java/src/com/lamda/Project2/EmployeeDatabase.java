package com.lamda.Project2;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {

	public static List<Employee> getAll(){
		return Stream.of(
				new Employee(1, "raj", "V5", 5000),
				new Employee(2, "Vikram", "V4", 89000),
				new Employee(3, "suraj", "V5", 6000),
				new Employee(4, "Nauel", "V4", 7000),
				new Employee(5, "suman", "V5", 5000)
				
				).collect(Collectors.toList());
	}
}
