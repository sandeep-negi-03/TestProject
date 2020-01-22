package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableListDemo {
	// Java program to demonstrate 
	// unmodifiableList() method 

		public static void main(String[] argv) 
			throws Exception 
		{ 
			try { 

				// creating object of ArrayList<Character> 
				List<Character> list = new ArrayList<Character>(); 

				// populate the list 
				list.add('X'); 
				list.add('Y'); 

				// printing the list 
				System.out.println("Initial list: " + list); 

				// getting unmodifiable list 
				// using unmodifiableList() method 
				List<Character> immutablelist = Collections 
													.unmodifiableList(list); 

				// Adding element to new Collection 
				System.out.println("\nTrying to modify"
								+ " the unmodifiablelist"); 
				immutablelist.add('Z'); 
			} 

			catch (UnsupportedOperationException e) { 
				System.out.println("Exception thrown : " + e); 
			} 
		} 

}
