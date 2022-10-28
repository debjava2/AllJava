package com.spring.multiple.datasource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Employee {
private int id;
private String name;
private int age;
private int salary;

public Employee(String name,int age,int salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
}

}
