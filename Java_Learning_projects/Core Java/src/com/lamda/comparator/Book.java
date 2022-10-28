package com.lamda.comparator;

public class Book {
private int id;
private String author;
private String bookName;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public Book(int id, String author, String bookName) {
	this.id = id;
	this.author = author;
	this.bookName = bookName;
}
@Override
public String toString() {
	return "Book [id=" + id + ", author=" + author + ", bookName=" + bookName + "]";
}

}
