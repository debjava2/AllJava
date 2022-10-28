package com.springboot.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Book {
@Id
@SequenceGenerator(name="sequence_seq",sequenceName = "BOOK_SEQ")
@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sequence_seq")
private int id;
private String author;
private float price;
private String title;
public Book(String author, float price, String title) {
	this.author = author;
	this.price = price;
	this.title = title;
}

}
