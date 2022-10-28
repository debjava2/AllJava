package com.foo.Spring;

import org.springframework.stereotype.Component;

@Component
public class BadForstune implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "It is a Bad Omen";
	}

}
