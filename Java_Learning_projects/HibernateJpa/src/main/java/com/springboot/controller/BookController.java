package com.springboot.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Model.Address;
import com.springboot.Model.Author;
import com.springboot.Model.Book;
import com.springboot.Model.Person;
import com.springboot.Model.Precession;
import com.springboot.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService service;
	
	@GetMapping("/insert")
	public void insertData() {
		Book book= new Book("Debahsish", (float) 27.00, "Raj");
		Author author=new Author("Ravi", new Date());
		service.insertData(book,author);
	}
	
	@GetMapping("/compositeKey")
	public void compositeKey() {
		
		Address add=new Address("JSR", (float) 20.66);
		Person person=new Person(add, "RajeshKumar", (float) 25.66);
		service.saveCompositeKey(person);
		
		/*
		 * Book book= new Book("Debahsish", (float) 27.00, "Raj"); Author author=new
		 * Author("Ravi", new Date()); service.insertData(book,author);
		 */
	}
	
	
	
	@GetMapping("/getAll")
	public Book getAllData() {
		return service.getAllData();
	}
	
	
	@GetMapping("/insertPrescion")
	public void insertPrescion() {
		Precession pre=new Precession();
		pre.setName("Debashishshs");
		pre.setPrice((float) 200.54366880);
		service.insertPrescion(pre);
	}
	
	
	
}
