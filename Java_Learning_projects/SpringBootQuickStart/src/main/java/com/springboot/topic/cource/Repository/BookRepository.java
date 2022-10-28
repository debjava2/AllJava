package com.springboot.topic.cource.Repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.Models.Book;

@Repository
public class BookRepository {
	@Autowired
	EntityManager entityManager;
	
	public void saveData() {
		entityManager.getTransaction().begin();
		Book fist=new Book(123, "Gii", "asdasd", (float) 2.5);
		Book fis2=new Book(1234, "Agaga", "1234", (float) 3.5);
		entityManager.persist(fist);
		entityManager.persist(fis2);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}
}
