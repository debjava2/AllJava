package com.lerankafka.intg.controller;





import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.standard.Media;

import org.apache.catalina.connector.Response;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.IntegerDeserializer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.KafkaUtils;
import org.springframework.kafka.test.EmbeddedKafkaBroker;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.kafka.test.utils.KafkaTestUtils;
import org.springframework.test.context.TestPropertySource;

import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.lerankafka.domain.Book;
import com.lerankafka.domain.LibraryEvent;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

@EmbeddedKafka(topics = {"libraray-events"}, partitions = 3)
@TestPropertySource(properties = {"spring.kafka.producer.bootstrap-servers=${spring.embedded.kafka.brokers}",
        "spring.kafka.admin.properties.bootstrap.servers=${spring.embedded.kafka.brokers}"})

@Timeout(5)
public class LibraryEventContollerIntegrationTest {
	
	@Autowired
	TestRestTemplate testRestTemplate;
	
	@Autowired
	EmbeddedKafkaBroker embeddedKafkaBroker;
	
	private Consumer<Integer,String> consumer;
	
	@BeforeEach
	void setUp() {
		
		/*
		 * Map<String,Object> configs= new
		 * HashMap<>(KafkaTestUtils.consumerProps("group1", "true",
		 * embeddedKafkaBroker)); //consumer=new DefaultKafkaConsumerFactory<>(configs,
		 * , new IntegerDeserializer(),new StringDeserializer()).createConsumer();
		 * 
		 * consumer = new DefaultKafkaConsumerFactory<>(configs, new
		 * IntegerDeserializer(), new StringDeserializer()).createConsumer();
		 * 
		 * 
		 * embeddedKafkaBroker.consumeFromAllEmbeddedTopics(consumer);
		 */
		

        Map<String,Object> configs = new HashMap<>(KafkaTestUtils.consumerProps("group1", "true", embeddedKafkaBroker));
        consumer = new DefaultKafkaConsumerFactory<>(configs, new IntegerDeserializer(), new org.apache.kafka.common.serialization.StringDeserializer()).createConsumer();
        embeddedKafkaBroker.consumeFromAllEmbeddedTopics(consumer);

		
		
	}
	
	@AfterEach
	void tearDown() {
		consumer.close();
	}
	
	@Test
	void postLibraryEvent() {
		
		Book book=Book.builder().bookId(123)
					.bookAuthor("Raj")
					.bookName("Tales From the Villege")
					.build();
		 

		LibraryEvent libEvent=LibraryEvent.builder()
								.libraryEvent(null)
								.book(book).build();
		
		HttpHeaders headers=new HttpHeaders();
		headers.set("content-type", MediaType.APPLICATION_JSON.toString());
		HttpEntity<LibraryEvent> request=new HttpEntity<LibraryEvent>(libEvent,headers);
		
		ResponseEntity<LibraryEvent> resposeEntity =	testRestTemplate.exchange("/v1/libraryevent", HttpMethod.POST,request,LibraryEvent.class);
		assertEquals(HttpStatus.CREATED, resposeEntity.getStatusCode()); 
		
		ConsumerRecord<Integer, String> consumeRecordr=KafkaTestUtils.getSingleRecord(consumer, "libraray-events");
		String valueOf="{\"libraryEvent\":null,\"libraryEventType\":\"Add\",\"book\":{\"bookId\":123,\"bookName\":\"Tales From the Villege\",\"bookAuthor\":\"Raj\"}";
		consumeRecordr.key();
		String value = consumeRecordr.value();
		//assertEquals(valueOf,value);
		
	}
	
}
