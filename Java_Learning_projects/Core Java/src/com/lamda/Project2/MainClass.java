package com.lamda.Project2;

import java.util.*;

public class MainClass {
public static void main(String[] args) {
	List<Employee> employee=EmployeeDatabase.getAll();
	
	OptionalDouble k=employee.stream().filter((a)->a.getGrade().equals("V5")).findAny()
	.map(emp->emp.getSalary()).stream().mapToDouble(i->i).average();
	
	System.out.println(k);
	
}
}
