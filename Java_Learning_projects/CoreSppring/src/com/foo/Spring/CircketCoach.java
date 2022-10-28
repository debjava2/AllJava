package com.foo.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CircketCoach implements Coach {

	FortuneService service;
	
	public CircketCoach() {
		
	}
	public FortuneService getService() {
		return service;
	}


	@Autowired
	@Qualifier("badForstune")
	public void setService(FortuneService service) {
		this.service = service;
	}


	@Override
	public void coachType() {
		// TODO Auto-generated method stub
		service.getFortune();
	}

}
