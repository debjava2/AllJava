package com.kafkaconsumer.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafkaconsumer.DAO.LibraryEventDAO;
import com.kafkaconsumer.Entity.LibraryEvent;

import lombok.extern.slf4j.Slf4j;
//import com.kafkaconsumer.Entity.LibraryEventType;



@Service
@Slf4j
public class LibraryEventService {
	
	
	
	@Autowired
	LibraryEventDAO libraryEventDAO;
	
	@Autowired
	ObjectMapper objectMapper;
	
	public void processLibraryEvent(ConsumerRecord<Integer, String> consumerRecord) throws JsonMappingException, JsonProcessingException {
		LibraryEvent libEvent = objectMapper.readValue(consumerRecord.value(), LibraryEvent.class);
		
	
		
		switch(libEvent.getLibraryEventType()){
        case Add:
            save(libEvent);
            break;
        case UPDATE:
        	update(libEvent);
            //update operation
            break;
        default:
            log.info("Invalid Library Event Type");
    }

		 
	}

	private void update(LibraryEvent libEvent) {
		// TODO Auto-generated method stub
		libEvent.getBook().setLibraryEvent(libEvent);
		// TODO Auto-generated method stub
		libraryEventDAO.save(libEvent);
	}

	private void save(LibraryEvent libEvent) {
		libEvent.getBook().setLibraryEvent(libEvent);
		// TODO Auto-generated method stub
		libraryEventDAO.save(libEvent);
	}
}
