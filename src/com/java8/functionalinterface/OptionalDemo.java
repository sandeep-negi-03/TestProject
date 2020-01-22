package com.java8.functionalinterface;

import java.util.Optional;

public class OptionalDemo {

	
	public static void main(String[] args) {
		Person person = new Person();
		Person person2 = null;
		
		Optional<Person> ops2 = Optional.ofNullable(person2);
		Optional<Person> ops = Optional.of(person);
		
		System.out.println(ops.get().name);
		System.out.println(ops2.orElse(person2));
	}
	
	
}


class Person {
	String name = "s";
}