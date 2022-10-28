package com.springboot.Model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Author {
@Id
@SequenceGenerator(name="sequence_seq",sequenceName = "BOOK_SEQ")
@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequence_seq")
private int id;
private String name;
private Date birthDat2;
public Author(String name, Date birthDat2) {
	this.name = name;
	this.birthDat2 = birthDat2;
}


}
