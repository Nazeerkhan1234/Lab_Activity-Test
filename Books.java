package com.test;

import java.util.*;
import java.util.stream.Collectors;

class Book {
	String Bookid;
	String title;
	String author;
	String category;
	float price;
	public Object name;
	// create constructor
	public Book(String bookid, String title, String author, String category, float price) { 
		this.Bookid = bookid;
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

}

public class Books {
	// main method
	public static void main(String[] args) { 
		//  create a object
		ArrayList<Book> obj = new ArrayList<Book>(); 
		Book b = new Book("1", "java", "james", "Programming lang", 300); 

		Book b1 = new Book("2 ", "c", "denish", "Basic prog", 250);

		Book b2 = new Book("3", "python", "Giudo", "Programming", 280);

		Book b3 = new Book("4", "dsa", "Michel", "Algo ", 400);

		obj.add(b);
		obj.add(b1);
		obj.add(b2);
		obj.add(b3);

		// search a book based on title 
		List<String> Title = obj.stream().map(p -> p.title).collect(Collectors.toList());
		System.out.println("title name are :- " + Title);

		// search a book based on author
		List<String> Author = obj.stream().map(p1 -> p1.author).collect(Collectors.toList());
		System.out.println("author name are :- " + Author);
		//  display all by a loop
		for (Book b12 : obj) 
		{
			System.out
					.println(b12.Bookid + " " + b12.title + " " + b12.author + " " + b12.category + " " + b12.category);
		}

	}
}
