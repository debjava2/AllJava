package com.logback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class MainController {
	  public static Logger logger = LoggerFactory.getLogger(MainController.class);
	@GetMapping("/welcome")
    public String welcome() {
		logger.debug("hello");
		logger.debug("hello");
		logger.debug("hello");
		logger.debug("hello");
		logger.debug("hello");
		logger.debug("hello");
		logger.debug("hello");
		logger.info("Hello, world");
    	return "Welcome";
    }
}
