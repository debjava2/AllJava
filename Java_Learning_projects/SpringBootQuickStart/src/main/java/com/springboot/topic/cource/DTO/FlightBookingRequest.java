package com.springboot.topic.cource.DTO;

import com.springboot.Models.PassengerInfo;
import com.springboot.Models.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingRequest {
private PassengerInfo passengerInfo;
private PaymentInfo paymentInfo;
}
