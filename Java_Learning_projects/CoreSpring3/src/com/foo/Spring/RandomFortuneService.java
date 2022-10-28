package com.foo.Spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Value( "${foo.email}" )
	private String email;
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Random Fortune Serivice "+email;
	}

}
