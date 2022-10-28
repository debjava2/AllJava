package com.lerankafka.producer;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.header.Header;
import org.apache.kafka.common.header.internals.RecordHeader;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.RoutingKafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lerankafka.controller.LibraryEventController;
import com.lerankafka.domain.LibraryEvent;

import jdk.internal.org.jline.utils.Log;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class LibrararyEventProducer {
	
	@Autowired
	KafkaTemplate<Integer, String> kafkaTemplate;
	
	@Autowired
	ObjectMapper objMapper;
	
	
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(LibraryEventController.class);
	String topic = "libraray-events";
	public void sendLibraryEvent(LibraryEvent libEvent) throws JsonProcessingException {
		Integer key=libEvent.getLibraryEvent();
		String value = objMapper.writeValueAsString(libEvent);
		ListenableFuture<SendResult<Integer, String>> listenableFuture=kafkaTemplate.sendDefault(key, value);
		listenableFuture.addCallback(new ListenableFutureCallback<SendResult<Integer, String>>() {
		
			@Override
			public void onSuccess(SendResult<Integer, String> result) {
				// TODO Auto-generated method stub
				handleSuccess(key,value,result);
			}

			private void handleSuccess(Integer key, String value, SendResult<Integer, String> result) {
				// TODO Auto-generated method stub
				log.info("Message send succesfuly for the key {} and the key is {}v , Partiotn is {}  " +key,value ,result.getRecordMetadata().partition());
			}

			@Override
			public void onFailure(Throwable ex) {
				// TODO Auto-generated method stub
				handleFailure(key,value,ex);
				
			}

			
			private void handleFailure(Integer key, String value, Throwable ex) {
				// TODO Auto-generated method stub
				log.error("Error Sending the Message and the Exception is {} ",ex.getMessage());
				try {
					throw ex;
				}catch (Throwable e) {
					// TODO: handle exception
					Log.error("Error on Failure :" ,e.getMessage());
				}
			}
		});
		
	}
	
	//This Takeks Async
	public void sendLibraryEventApproch2(LibraryEvent libEvent) throws JsonProcessingException {
		Integer key=libEvent.getLibraryEvent();
		String value = objMapper.writeValueAsString(libEvent);
		
		ProducerRecord<Integer,String> producerRecord = buildProducerRecord(key, value, topic);
		
		
		ListenableFuture<SendResult<Integer, String>> listenableFuture=kafkaTemplate.send(producerRecord);
		listenableFuture.addCallback(new ListenableFutureCallback<SendResult<Integer, String>>() {

			@Override
			public void onSuccess(SendResult<Integer, String> result) {
				// TODO Auto-generated method stub
				handleSuccess(key,value,result);
			}

			private void handleSuccess(Integer key, String value, SendResult<Integer, String> result) {
				// TODO Auto-generated method stub
				log.info("Message send succesfuly for the key {} and the key is {}v , Partiotn is {}  " +key,value ,result.getRecordMetadata().partition());
			}

			@Override
			public void onFailure(Throwable ex) {
				// TODO Auto-generated method stub
				handleFailure(key,value,ex);
				
			}

			private ProducerRecord<Integer, String> producerReccord(Integer key, String value, String topic2) {
				// TODO Auto-generated method stub
				
				List<Header> recordHeader = List.of(new RecordHeader("event-source", "scarrner".getBytes()));
				return new ProducerRecord<Integer,String>(topic2, null,key,value,recordHeader);
			}
			
			
			
			private void handleFailure(Integer key, String value, Throwable ex) {
				// TODO Auto-generated method stub
				log.error("Error Sending the Message and the Exception is {} ",ex.getMessage());
				try {
					throw ex;
				}catch (Throwable e) {
					// TODO: handle exception
					Log.error("Error on Failure :" ,e.getMessage());
				}
			}
		});
		
	}
	
	

	

	private ProducerRecord<Integer, String> buildProducerRecord(Integer key, String value, String topic2) {
		// TODO Auto-generated method stub
		 return new ProducerRecord<>(topic2, null, key, value, null);

	}

	public SendResult<Integer, String> sendLibrarayEventSyncronus(LibraryEvent libEvent) throws Exception {
		Integer key=libEvent.getLibraryEvent();
		String value = objMapper.writeValueAsString(libEvent);
		SendResult<Integer, String> listenableFuture=null;
		try {
			listenableFuture=kafkaTemplate.sendDefault(key, value).get();
		} catch (InterruptedException | ExecutionException ex) {
			// TODO Auto-generated catch block
			log.error("InterruptedException | ExecutionException Message and the Exception is {} ",ex.getMessage());
			throw ex;
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			log.error("Exception Message and the Exception is {} ",ex.getMessage());
			throw ex;
		}
		return listenableFuture;
	}
}
