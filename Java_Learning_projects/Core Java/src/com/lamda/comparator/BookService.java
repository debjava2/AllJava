package com.lamda.comparator;

import java.util.ArrayList;
import java.util.List;

public class BookService {

	public List<Book> getSortedBooks(){
		List<Book> ob=new ArrayList<>();
		ob.add(new Book(1, "Manoranjan", "Supernatural"));
		ob.add(new Book(2, "Ajay", "Hemmu"));
		ob.add(new Book(3, "Vidhan", "world at war"));
		return ob;
	}
}
