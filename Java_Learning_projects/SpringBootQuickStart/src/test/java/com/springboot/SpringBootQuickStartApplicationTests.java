package com.springboot;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.Models.Area;
import com.springboot.Models.Customer;
import com.springboot.Models.Guardian;
import com.springboot.Models.Product;
import com.springboot.Models.Students;
import com.springboot.Models.User;
import com.springboot.topic.cource.Repository.BookRepository;
import com.springboot.topic.cource.Repository.CustomerRepository;
import com.springboot.topic.cource.Repository.StudentRepository;

@SpringBootTest
class SpringBootQuickStartApplicationTests {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	ObjectMapper objetMapper;
	
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	BookRepository book;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void saveStudent() throws JsonProcessingException {
		/*
		 * Guardian guradian = Guardian.builder() .guardianName("Ajay")
		 * .guardianEmail("ajay@gmail.com") .guardianMobile("9871939301") .build();
		 * 
		 * 
		 * Students students=Students.builder()
		 * .emailId("binay@gmail.com").firstName("binay") .lastName("Mahato")
		 * .guardian(guradian) .build(); studentRepository.save(students);
		 */
		
		/*
		 * Area area=Area.builder().areaName("Adityapur").build(); User
		 * user=User.builder().userName("Debashish").area(area).build();
		 */
		
		Product product=Product.builder().pid(201).productName("oil")
					.qty(10).price(100).build();
		
		List<Product>  list=new ArrayList<>();
		list.add(product);
		
		Customer customer = Customer.builder().name("Debashish")
				
				
							.email("deb@gmail.com").gender("Male").product(list).build();
		
		 String jsonStr = objetMapper.writeValueAsString(customer);
		 
		 System.out.println(jsonStr);
				
	
	}
	
	@Test
	public void finadAllStudent() {
		/*
		 * System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		 * System.out.println(studentRepository.findAll());
		 */
	}
	@Test
	public void finadAllByFirstName() {
		/*
		 * System.out.println("#################################################");
		 * System.out.println(studentRepository.findByFirstName("Debahsish"));
		 * System.out.println(
		 * "######################&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&##########################"
		 * ); System.out.println(studentRepository.findByFirstNameContaining("De")
		 * +"         " +studentRepository.findByFirstNameEndsWith("ay") );
		 */
		
		
		book.saveData();
		
		
	}
	

}
