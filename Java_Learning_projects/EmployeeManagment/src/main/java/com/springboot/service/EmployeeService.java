package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Model.Employee;
import com.springboot.Repository.EmployeeRepositroy;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepositroy repo;
	public void insertData(Employee emp) {
		repo.save(emp);
	}
	
	public List<Employee> getAllEmployee(){
		return repo.findAll();
	}

	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	public void delete(String empId) {
		// TODO Auto-generated method stub
		repo.deleteById(empId);
	}
}
