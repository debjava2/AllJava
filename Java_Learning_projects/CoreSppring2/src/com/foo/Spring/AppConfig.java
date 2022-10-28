package com.foo.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	FortuneService service;

	@Bean
	public Samsung getSamsung() {
		return new Samsung();
	}
	@Bean
	public Proceersor getProcessor() {
		return new SnapDragon();
	}
	
	@Bean
	public Coach getCoachBean() {
		return new TennisCoach(service);
	}
	@Bean
	public FortuneService getService() {
		return new HappyFortuneService();
	}
}
