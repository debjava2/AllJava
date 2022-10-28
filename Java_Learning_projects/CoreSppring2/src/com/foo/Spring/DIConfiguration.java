package com.foo.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DIConfiguration {

	@Bean
	public MessageService getService() {
		return new EmailService();
	}
}
