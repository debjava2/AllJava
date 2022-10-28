package com.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Model.Employee;
import com.springboot.Util.UniqueKey;
import com.springboot.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;
	@PostMapping("/api/insert/")
	public void insertData(@RequestBody Employee emp) {
		/*
		 * String empId="E"; List<Employee> em=service.getAllEmployee(); int
		 * noEmp=em.size(); emp.setEmpId(UniqueKey.uniqueKey(noEmp));
		 * service.insertData(emp);
		 */
	}
	
	@PutMapping("/api/update")
	public Employee updateData(@RequestBody Employee emp) {
		return service.updateEmployee(emp);
	}
	
	@DeleteMapping("/api/delete/{empId}")
	public void DeleteEmployee(@PathVariable String empId) {
		service.delete(empId);
	}
	
	
	
}
