package com.lerankafka.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LibraryEvent {
	
	private Integer libraryEvent;
	private LibraryEventType libraryEventType;
	private Book book;
	/*
	 * public Integer getLibraryEvent() { return libraryEvent; } public void
	 * setLibraryEvent(Integer libraryEvent) { this.libraryEvent = libraryEvent; }
	 * public Book getBook() { return book; } public void setBook(Book book) {
	 * this.book = book; } public LibraryEventType getLibraryEventType() { return
	 * libraryEventType; } public void setLibraryEventType(LibraryEventType
	 * libraryEventType) { this.libraryEventType = libraryEventType; }
	 */
	
	
}
