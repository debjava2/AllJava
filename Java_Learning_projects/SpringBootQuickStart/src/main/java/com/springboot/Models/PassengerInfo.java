package com.springboot.Models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name="PASSENGER_INFO")
public class PassengerInfo {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long pid;
private String name;
private String email;
private String source;
private String destination;
@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-mm-yyyy")
private Date travelDate;
private String pickUptime;
private String arrivalTime;
private double fare;

}
