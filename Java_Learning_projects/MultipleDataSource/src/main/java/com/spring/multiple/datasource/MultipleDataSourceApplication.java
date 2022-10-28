package com.spring.multiple.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultipleDataSourceApplication implements CommandLineRunner {

	@Autowired
	EmployeeRepository empRepo;
	
	@Autowired
	UserRepository userRepo;
	
	/*
	 * @Autowired Sample s1;
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(MultipleDataSourceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee emp=new Employee("Booby", 24, 600000);
		empRepo.insert(emp);
		
		User user=new User("Raj", "raj.gmail.com", "male");
		userRepo.insert(user);
		
	//s1.getAccess();
		
		
	}

}
