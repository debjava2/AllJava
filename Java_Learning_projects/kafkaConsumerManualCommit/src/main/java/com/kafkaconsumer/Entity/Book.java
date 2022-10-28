package com.kafkaconsumer.Entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Book {
@Id
@GeneratedValue
@Column(name = "bookId")
private Integer bookId;
@Column(name = "bookName")
private String bookName;
@Column(name = "bookAuthor")
private String bookAuthor;
@OneToOne
@JoinColumn(name = "libraryEventId")
private LibraryEvent libraryEvent;

}
