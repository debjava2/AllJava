package com.springboot.topic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.topic.service.TopicService;
import com.springboot.Models.*;

@RestController
public class TopicController {

	@Autowired
	private TopicService service;

	@GetMapping("/topics")
	public List<Topics> getAllTpoics() {
		return service.getAllTopics();
	}

	@GetMapping("/topics/{id}")
	public Topics getAllTpoics(@PathVariable Integer id) {
		return service.getTopicId(id);
	}

	@PostMapping("/topics")
	public void addTopic(@RequestBody Topics topics) {
		service.addTopics(topics);
	}

	@PutMapping("/topics/{id}")
	public void updateTopic(@RequestBody Topics topics) {
		service.updateTopics(topics);
	}
	
	@DeleteMapping("/topics/{id}")
	public void deleteTopic(@PathVariable Integer id) {
		service.deleteTopics(id);
	}

}
