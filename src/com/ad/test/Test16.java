package com.ad.test;

import java.util.HashSet;

public class Test16 {

	public static void main(String[] args) {
		Book book1 = new Book(10023);
		Book book2 = new Book(10053);
		Book book3 = new Book(10088);
		Book book4 = new Book(10099);
		Book book5 = new Book(12000);
		
		HashSet<Book> bookSet = new HashSet<>();
		bookSet.add(book1);
		bookSet.add(book2);
		bookSet.add(book3);
		bookSet.add(book4);
		bookSet.add(book5);
		
		bookSet.forEach(System.out::println);
		System.out.println(bookSet.size()); //5
		System.out.println(bookSet.contains(new Book(12000))); //false
		System.out.println(bookSet.remove(new Book(10099))); //false
		System.out.println(bookSet.size()); //5
	}
	
}

class Book{
	private int isbn;
	Book(int isbn){
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		
		return String.valueOf(isbn);
	}
}
