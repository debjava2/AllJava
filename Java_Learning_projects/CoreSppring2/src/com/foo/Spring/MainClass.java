package com.foo.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
public static void main(String[] args) {
	ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
	Samsung sam=factory.getBean(Samsung.class);
	sam.modelName();
	
	ApplicationContext f=new AnnotationConfigApplicationContext(Coach.class);
	
	Coach c=f.getBean("tennisCoach",Coach.class);
	c.coachType();
	
}
}
