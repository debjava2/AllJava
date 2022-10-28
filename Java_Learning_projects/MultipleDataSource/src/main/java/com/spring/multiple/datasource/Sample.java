package com.spring.multiple.datasource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Sample {

	@Bean
	public Sample getName() {
		return new Sample();
	}
	
	/*
	 * public void getAccess() { System.out.println("/Hiiiiiiiiiiiiiii"); }
	 */
}
