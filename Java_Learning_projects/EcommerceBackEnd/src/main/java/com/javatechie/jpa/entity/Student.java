package com.javatechie.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Table(
		name="tbl_student",
		uniqueConstraints = @UniqueConstraint
		(
		name="emailid_unique",
		columnNames = "email_address"
				)
		)
public class Student {
	@Id
	@SequenceGenerator(name = "student_sequence",
	allocationSize = 1,
	sequenceName = "student_sequence")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
	generator = "student_sequence")
	private long studentId;
	private String firstName;
	private String lastName;
	@Column(name="email_address",nullable = false,unique = true)
	private String emailId;
	@Embedded
	private Guardian guardian;
}
