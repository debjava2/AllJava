package com.springboot.topic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Models.Topics;
import com.springboot.topic.Repository.TopicRepository;

@Service
public class TopicService {

	@Autowired
	TopicRepository respo;
	
	
	public List<Topics> getAllTopics() {
		List<Topics> topics=new ArrayList<>();
		respo.findAll().forEach((t)->topics.add(t));
		// TODO Auto-generated method stub
		return topics;
	}

	public Topics getTopicId(Integer id) {
		ArrayList<Topics> result = new ArrayList<>();
		respo.findById(id).ifPresent(result::add);
		// TODO Auto-generated method stub
		return result.get(0);
	}

	public void addTopics(Topics topics) {
		// TODO Auto-generated method stub
		respo.save(topics);
	}

	public void updateTopics(Topics topics) {
		// TODO Auto-generated method stub
		respo.save(topics);
	}

	public void deleteTopics(Integer id) {
		// TODO Auto-generated method stub
		respo.deleteById(id);
	}

}
