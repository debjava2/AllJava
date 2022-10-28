package com.springboot.topic.cource.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.Models.Department;

import com.springboot.Models.DeptEmpDto;



public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	@Query("SELECT new com.springboot.Models.DeptEmpDto(d.name,d.description, e.name, e.email, e.address) "
			+ "FROM Department d LEFT JOIN d.employees e")
	List<DeptEmpDto> fetchEmpDeptDataLeftJoin();

	@Query("SELECT new com.springboot.Models.DeptEmpDto(d.name,d.description, e.name, e.email, e.address) "
			+ "FROM Department d RIGHT JOIN d.employees e")
	List<DeptEmpDto> fetchEmpDeptDataRightJoin();

}