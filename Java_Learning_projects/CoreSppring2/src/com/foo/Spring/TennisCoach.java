package com.foo.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class TennisCoach implements Coach {

	FortuneService service;
	public TennisCoach(){
		
	}
	@Autowired
	public TennisCoach(FortuneService service) {
		this.service = service;
	}

	@Override
	public void coachType() {
		System.out.println("CoactType S");
		// TODO Auto-generated method stub
		System.out.println(service.getFortune());
	}

	

}
