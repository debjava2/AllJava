package com.springboot.topic.cource.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.topic.cource.Repository.EnityBuilder;

@Service
public class EntityService {
 
	@Autowired
	EnityBuilder respo;
	
	public EnityBuilder insertData(EnityBuilder data) {
		return respo.save(data);
	}
	
	public int  getCountData(){
		return 0;
		
	}
}
