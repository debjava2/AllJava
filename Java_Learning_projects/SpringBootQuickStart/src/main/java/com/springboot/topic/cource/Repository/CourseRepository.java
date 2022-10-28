package com.springboot.topic.cource.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Models.Topics;
import com.springboot.cource.Models.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer>{

	List<Course> findByTopicsId(Integer id);
}
