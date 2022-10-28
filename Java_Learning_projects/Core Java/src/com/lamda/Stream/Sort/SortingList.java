package com.lamda.Stream.Sort;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.lamda.Stream.Project.DataBase;
import com.lamda.Stream.Project.Employee;

public class SortingList {
public static void main(String[] args) {
	List<Employee> employee=DataBase.getEmployee();
	
	Collections.sort(employee, (o1,o2)->o1.getSalary()-o2.getSalary());
	System.out.println(employee);
	
//	employee.stream().sorted(Comparator.comparing(emp->emp.))
	
	//Tredetional Sorting
	List<Integer> list=new ArrayList<>();
	list.add(8);
	list.add(10);
	list.add(2);
	list.add(7);
	
	Collections.sort(list);//Acending
	Collections.reverse(list);//Decending
	list.stream().sorted().forEach((t)->System.out.println(t));//Acending order
	list.stream().sorted(Comparator.reverseOrder()).forEach((t)->System.out.println(t));
	
	
}
}
