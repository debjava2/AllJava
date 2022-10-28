package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.Model.Author;
import com.springboot.Model.Book;
import com.springboot.Model.Person;
import com.springboot.Model.Precession;
import com.springboot.respository.BookRepo;

@Service
public class BookService {

@Autowired
private BookRepo bookRepo;

public void insertData(Book book,Author author) {
	bookRepo.insertData(book,author);
}

public Book getAllData() {
	// TODO Auto-generated method stub
	return bookRepo.getAllData();
}

public void saveCompositeKey(Person person) {
	// TODO Auto-generated method stub
	bookRepo.saveCompositeKey(person);
}

public void insertPrescion(Precession pre) {
	// TODO Auto-generated method stub
	bookRepo.insertPrescion(pre);
}

}
