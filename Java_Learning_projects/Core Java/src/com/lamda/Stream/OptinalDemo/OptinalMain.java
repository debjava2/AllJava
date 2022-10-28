package com.lamda.Stream.OptinalDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.lamda.Stream.Project.DataBase;
import com.lamda.Stream.Project.Employee;

public class OptinalMain {
public static void main(String[] args) {
	/*
	 * empty
	 * of
	 * ofNullable
	 */
	
	Customer customer=new 
			Customer(1, "Debashish", null, Arrays.asList("356663","67748894"));
	
	Optional<Object> optional=Optional.empty();

	System.out.println(optional);
	//Optional<Object> optional2=Optional.of(customer.getEmail());
	//System.out.println(optional2);
	
	Optional<Object> optional3=Optional.ofNullable(customer.getEmail());
	System.out.println(optional3);
	
	if(optional3.isPresent()) {
		System.out.println("@@@@@@@@@@@@");
		
	}else {
		System.out.println("************************");
	}
	
	System.out.println(optional3.orElse("kk@gmail.com"));
	try {
		System.out.println(optional3.orElseThrow(()->new Exception("email not Presseent")));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//TO upper CASE 
	
	//System.out.println(optional3.map(String::toUpperCase)))
	
	OptinalMain.serchItem("Prakash");
	
}

public static void serchItem(String name) {
	List<Employee> employee= DataBase.getEmployee();
	Employee employee2=employee.stream().
	filter(p->
	
	p.getName().equalsIgnoreCase(name)
	
			).findAny().orElse(new Employee());
	
	System.out.println(employee2.getName());
}

}
