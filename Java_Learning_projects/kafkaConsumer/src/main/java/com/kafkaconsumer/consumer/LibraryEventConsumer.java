package com.kafkaconsumer.consumer;

import javax.annotation.PostConstruct;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
public class LibraryEventConsumer {
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(LibraryEventConsumer.class);
	
	@PostConstruct
	public void  intilizeOffser() {
		System.out.println("Hello");
	}
	
	@KafkaListener(topics={"libraray-events"})
	public void onMessage(ConsumerRecord<Integer, String> consumerRecord) {
		log.info("Consumerd''''''''''''''################# "+consumerRecord);
	}
}
