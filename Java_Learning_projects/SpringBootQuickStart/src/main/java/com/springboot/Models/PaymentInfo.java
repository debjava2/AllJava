package com.springboot.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
@Table(name="PAYMENT_INFO")
public class PaymentInfo {
@Id
@GeneratedValue(generator = "uuid2")
@GenericGenerator(name="uuid2",strategy = "org.hibernate.id.UUIDGenerator")
@Column(name="PAYMENT_ID", length=36)
private String paymentId;
private String accountNumber;
private double amount;
private String cardType;
private Long passengerId;
}
