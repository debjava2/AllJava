package com.lamda.comparator;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainMethod {
public static void main(String[] args) {
	BookService service =new BookService();
	List<Book> book=service.getSortedBooks();
	
	/*
	 * Collections.sort(book,new Comparator<Book>() {
	 * 
	 * @Override public int compare(Book o1, Book o2) { // TODO Auto-generated
	 * method stub return o1.getBookName().compareTo(o2.getBookName()); } });
	 * 
	 * System.out.println(book);
	 */
	
	Collections.sort(book,(o1,o2)->o1.getBookName().compareTo(o2.getBookName()));
	

	
	System.out.println(book);
	
}
}
