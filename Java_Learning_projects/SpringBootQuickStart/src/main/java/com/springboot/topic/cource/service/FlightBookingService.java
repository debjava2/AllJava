package com.springboot.topic.cource.service;

import java.util.UUID;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.Models.PassengerInfo;
import com.springboot.Models.PaymentInfo;
import com.springboot.Util.PaymentUtil;
import com.springboot.topic.cource.DTO.FlightBookingAckhnowlegement;
import com.springboot.topic.cource.DTO.FlightBookingRequest;
import com.springboot.topic.cource.Repository.PassengerInfoRepository;
import com.springboot.topic.cource.Repository.PaymentInfoRepository;

@Service
public class FlightBookingService {

	@Autowired
	private PassengerInfoRepository passRepo;
	@Autowired
	private PaymentInfoRepository paymentRepo;

	@Transactional
	public FlightBookingAckhnowlegement bookFlightTicket(FlightBookingRequest request) {
		PassengerInfo passengerInfo = request.getPassengerInfo();
		passRepo.save(passengerInfo);
		PaymentInfo paymentInfo = request.getPaymentInfo();
		PaymentUtil.isValidAmount(passengerInfo.getFare(), paymentInfo.getAccountNumber());
		paymentInfo.setPassengerId(passengerInfo.getPid());
		paymentInfo.setAmount(passengerInfo.getFare());

		paymentRepo.save(paymentInfo);

		return new FlightBookingAckhnowlegement("Success", 
				passengerInfo.getFare(), UUID.randomUUID().toString(), passengerInfo);

	}
}
