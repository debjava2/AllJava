package com.springboot.topic.cource.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Models.Topics;
import com.springboot.cource.Models.Course;
import com.springboot.topic.Repository.TopicRepository;
import com.springboot.topic.cource.Repository.CourseRepository;

@Service
public class CourceService {

	@Autowired
	CourseRepository respo;
	
	
	public List<Course> getAllCources(Integer id) {
		/*
		 * List<Course> topics=new ArrayList<>();
		 * respo.findAll().forEach((t)->topics.add(t));
		 */
		// TODO Auto-generated method stub
		return respo.findByTopicsId(id);
	}

	public Course getCourseId(Integer id) {
		ArrayList<Course> result = new ArrayList<>();
		respo.findById(id).ifPresent(result::add);
		// TODO Auto-generated method stub
		return result.get(0);
	}

	public void addCourse(Course cource) {
		// TODO Auto-generated method stub
		
		respo.save(cource);
	}

	public void updateCource(Course cource) {
		// TODO Auto-generated method stub
		respo.save(cource);
	}

	public void deleteTopics(Integer id) {
		// TODO Auto-generated method stub
		respo.deleteById(id);
	}

}
