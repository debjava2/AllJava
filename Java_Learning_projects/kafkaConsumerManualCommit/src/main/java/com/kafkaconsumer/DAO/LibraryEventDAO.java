package com.kafkaconsumer.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kafkaconsumer.Entity.LibraryEvent;
@Repository
public interface LibraryEventDAO extends CrudRepository<LibraryEvent, Integer> {

}
