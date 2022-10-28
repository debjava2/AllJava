package com.lamda.Stream.Project;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainClass {
	
	public static List<Employee> getFIlterData(){
	return 	DataBase.getEmployee().stream().
		filter((k)->k.getSalary()>50000).collect(Collectors.toList());
	}
public static void main(String[] args) {
	System.out.println(getFIlterData());
}
}
