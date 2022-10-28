package com.springboot.respository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.Model.Author;
import com.springboot.Model.Book;
import com.springboot.Model.Person;
import com.springboot.Model.Precession;

@Repository
@Transactional
public class BookRepo {

@PersistenceContext
private EntityManager entityManager;	 
public void insertData(Book book,Author author) {
	entityManager.persist(book);
	entityManager.persist(author);
}

public Book getAllData() {
	return entityManager.find(Book.class, 270);
}

public void saveCompositeKey(Person person) {
	// TODO Auto-generated method stub
	entityManager.persist(person);
	
}

public void insertPrescion(Precession pre) {
	// TODO Auto-generated method stub
	entityManager.persist(pre);
}

}
