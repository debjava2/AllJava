package com.lamda.Stream.Project;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

	public static List<Employee> getEmployee(){
		List<Employee> emp=new ArrayList<>();
		emp.add(new Employee(178, "Rohasna", "IT",60000 ));
		emp.add(new Employee(388, "Bikash", "CIVIL",80000 ));
		emp.add(new Employee(470, "BIMAL", "defence",50000 ));
		emp.add(new Employee(678, "Sourav", "core",40000 ));
		
		emp.add(new Employee(278, "Prakash", "social",1200000 ));
		
		return emp;
	}
}
