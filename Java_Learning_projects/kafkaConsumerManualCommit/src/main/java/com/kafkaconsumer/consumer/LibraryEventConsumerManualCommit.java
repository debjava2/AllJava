package com.kafkaconsumer.consumer;

import javax.annotation.PostConstruct;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.AcknowledgingMessageListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.kafkaconsumer.service.LibraryEventService;


@Component
public class LibraryEventConsumerManualCommit implements AcknowledgingMessageListener<Integer, String> {
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(LibraryEventConsumerManualCommit.class);
	
	@Autowired
	LibraryEventService libraryEventService;
	
	@PostConstruct
	public void  intilizeOffser() {
		System.out.println("Hello...................................");
	}
	
	@KafkaListener(topics={"libraray-events"})
	public void onMessage(ConsumerRecord<Integer, String> consumerRecord) {
		log.info("Consumerd''''''''''''''################# "+consumerRecord);
	}

	@Override
	@KafkaListener(topics={"libraray-events"})
	public void onMessage(ConsumerRecord<Integer, String> consumerRecord, Acknowledgment ack) {
		// TODO Auto-generated method stub
		log.info("Consumerd''''''''''''''################# $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		log.info("Consumerd''''''''''''''################# "+consumerRecord);
		try {
			libraryEventService.processLibraryEvent(consumerRecord);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ack.acknowledge();
	}
}
