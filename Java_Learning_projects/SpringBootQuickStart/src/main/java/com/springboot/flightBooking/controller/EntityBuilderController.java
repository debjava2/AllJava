package com.springboot.flightBooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.topic.cource.Repository.EnityBuilder;
import com.springboot.topic.cource.service.EntityService;

@RestController
public class EntityBuilderController {
	
	@Autowired
	EntityService service;

	@GetMapping("/api/insertData")
	public boolean insertDate(@RequestBody EnityBuilder request) {
		
		EnityBuilder builder=service.insertData(request);
		List a=builder.findAll();
		System.out.println(a.size());
		return false;
		
	}
}
