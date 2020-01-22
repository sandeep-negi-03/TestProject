package com.java8.streams;

import java.util.stream.Stream;

public class FilterExample {

	public static void main(String[] args) {
		int sum = Stream.of(1,2,3,4,5,6,7,8,9)
		.filter(i->i%2==0).skip(3).
		mapToInt(i->i*i).sum();
		//.forEach(System.out::println);
		
		System.out.println(sum);
	}
	
}
