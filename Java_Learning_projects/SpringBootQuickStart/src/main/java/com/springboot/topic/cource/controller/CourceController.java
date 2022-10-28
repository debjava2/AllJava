package com.springboot.topic.cource.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.topic.cource.service.CourceService;

import com.springboot.Models.*;
import com.springboot.cource.Models.Course;

@RestController
public class CourceController {

	@Autowired
	private CourceService service;

	@GetMapping("/topics/{id}/course")
	public List<Course> getAllCources(@PathVariable Integer id) {
		return service.getAllCources(id);
	}

	@GetMapping("/topics/{topicsId}/course/{id}")
	public Course getAllTpoics(@PathVariable Integer id) {
		return service.getCourseId(id);
	}

	@PostMapping("/topics/{topicsId}/course/{id}")
	public void addCourse(@RequestBody Course course,@PathVariable Integer id) {
		course.setTopics(new Topics(id,"",""));
		service.addCourse(course);
	}

	@PutMapping("/topics/{topicsId}/course/{id}")
	public void updateCourse(@RequestBody Course course,@PathVariable Integer id) {
		course.setTopics(new Topics(id,"",""));
		service.updateCource(course);
	}
	
	@DeleteMapping("/topics/{topicsId}/course/{id}")
	public void deleteTopic(@PathVariable Integer id) {
		service.deleteTopics(id);
	}

}
