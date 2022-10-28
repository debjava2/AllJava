package com.springboot.topic.cource.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.Models.Students;

@Repository
public interface StudentRepository extends JpaRepository<Students, Long> {
	
	public List<Students> findByFirstName(String firstName);
	
	public List<Students> findByFirstNameContaining(String name);
	
	public List<Students> findByFirstNameEndsWith(String name);
	
	public List<Students> findByFirstNameStartsWith(String name);
	
	@Query("select s from Students s where s.emailId=?1 ")
	public Students getStudentByEmailid(String email);
	
	@Query("select s from Students s where s.firstName like %?1 and s.lastName like %?2")
	public Students getStudentByNameLike(String name,String lastName);
	
	
}
