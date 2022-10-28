package com.lerankafka.unit;

import static org.hamcrest.CoreMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lerankafka.controller.LibraryEventController;
import com.lerankafka.domain.Book;
import com.lerankafka.domain.LibraryEvent;
import com.lerankafka.producer.LibrararyEventProducer;

@WebMvcTest(LibraryEventController.class)
@AutoConfigureMockMvc
public class KafkaLibrarayEventUnitTestCase {
	
	
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	LibrararyEventProducer libEventProducer;
	
	ObjectMapper objectMapper=new ObjectMapper();

	@Test
	void postLibarayEvent() throws Exception {
		
		Book book=Book.builder().bookId(123)
				.bookAuthor("Raj")
				.bookName("Tales From the Villege")
				.build();
	 

	LibraryEvent libEvent=LibraryEvent.builder()
							.libraryEvent(null)
							.book(book).build();
	
	String json=objectMapper.writeValueAsString(libEvent);
	
	doNothing().when(libEventProducer)
	.sendLibrarayEventSyncronus((LibraryEvent) isA(LibraryEvent.class));
	
	
	mockMvc.perform(post("/v1/libraryevent").content(json)
			.accept(MediaType.APPLICATION_JSON)
			).andExpect(status().isCreated());
	
	}
	
	
}
