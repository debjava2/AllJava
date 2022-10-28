package com.foo.Spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	
	
	FortuneService service;

	public FortuneService getService() {
		return service;
	}
	
	
	
	/*
	 * @Autowired public void setService(FortuneService service) { this.service =
	 * service; }
	 */
	//Method Injection
	/*
	 * @Autowired
	 * 
	 * @Qualifier("randomFortuneService") public void doStuff(FortuneService
	 * service) { this.service=service; }
	 */
	
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService service) {
		System.out.println("@@@@@@@@@@@@@@@@@@@");
		this.service = service;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hiiiiiiiiiiiii";
	}

	



	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return service.getFortune();
	}

	@PostConstruct
	public void doStuff() {
		System.out.println("Before Bean Cration:");
	}
	
	@PreDestroy
	public void cleanupWork() {
		System.out.println("After Bean Cration:");
	}
}
