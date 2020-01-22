package com.sapient.ace;

import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.Set;

/**
 * Create a Movie class which has ratings. From a Set of movies print the Top rated movies, average and the lowest rating movies.
 * @author sannegi6
 *
 */

public class Java8_3 {

	public static void main(String[] args) {
		
		Set<Movie> set = new HashSet<Movie>();
		set.add(new Movie("A", 1));
		set.add(new Movie("B", 1));
		set.add(new Movie("C", 2));
		set.add(new Movie("D", 2));
		set.add(new Movie("E", 3));
		
		
		set.stream().filter(i->i.getRating()>2).forEach(System.out::println);
		
		IntSummaryStatistics intSummaryStatistics = new IntSummaryStatistics();
		
		Iterator<Movie> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			
		intSummaryStatistics.accept(iterator.next().getRating());
		}
		
		System.out.println("Average : " + intSummaryStatistics.getAverage());
		System.out.println("Max : " + intSummaryStatistics.getMax());
		System.out.println("Min : " + intSummaryStatistics.getMin());		
		
		
	}
	
		
	
	
}

class Movie{
	
	private String name;
	private int rating;
	
	public Movie(String name, int rating) {
		super();
		this.name = name;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", rating=" + rating + "]";
	}
	
}