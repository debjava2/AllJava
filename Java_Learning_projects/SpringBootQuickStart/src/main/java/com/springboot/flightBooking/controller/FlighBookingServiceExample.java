package com.springboot.flightBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.topic.cource.DTO.FlightBookingAckhnowlegement;
import com.springboot.topic.cource.DTO.FlightBookingRequest;
import com.springboot.topic.cource.service.FlightBookingService;

@RestController
@EnableTransactionManagement
public class FlighBookingServiceExample {
	@Autowired
	FlightBookingService service;
	@PostMapping("/bookFlight")
	public FlightBookingAckhnowlegement bookFlight(@RequestBody FlightBookingRequest request) {
		return service.bookFlightTicket(request);
		
	}
}
