package com.kafkaconsumer.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class LibraryEvent {
	
	@Id
	@GeneratedValue
	@Column(name = "libraryEventId")
	private Integer libraryEvent;
	@Enumerated(EnumType.STRING)
	@Column(name = "libraryEventType")
	private LibraryEventType libraryEventType;
	@OneToOne(mappedBy = "libraryEvent",cascade = CascadeType.ALL)
	@ToString.Exclude
	private Book book;
	
	
	
}
