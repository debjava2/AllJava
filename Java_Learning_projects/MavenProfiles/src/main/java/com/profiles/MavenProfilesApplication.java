package com.profiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenProfilesApplication {

	
	private static final Logger logger = LoggerFactory.getLogger(MavenProfilesApplication.class);
	
	public static void main(String[] args) {
		logger.info("Hello World!");
		SpringApplication.run(MavenProfilesApplication.class, args);
	}

}
