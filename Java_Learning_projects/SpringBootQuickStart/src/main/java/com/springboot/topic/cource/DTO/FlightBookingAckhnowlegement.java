package com.springboot.topic.cource.DTO;

import com.springboot.Models.PassengerInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingAckhnowlegement {
private String status;
private double totalFare;
private String pnrNo;
private PassengerInfo passengerInfo;
}
