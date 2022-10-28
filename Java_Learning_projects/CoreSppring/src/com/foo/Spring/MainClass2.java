package com.foo.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass2 {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context=
			new ClassPathXmlApplicationContext("applicationContext.xml");
	
//	//Coach coach=context.getBean("tennisCoach",Coach.class);
	//coach.coachType();
	Coach coach2=context.getBean("circketCoach",Coach.class);
	coach2.coachType();
	context.close();
}
}
