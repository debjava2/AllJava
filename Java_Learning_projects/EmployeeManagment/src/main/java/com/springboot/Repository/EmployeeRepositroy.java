package com.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Model.Employee;

@Repository
public interface EmployeeRepositroy extends JpaRepository<Employee, String> {

}
