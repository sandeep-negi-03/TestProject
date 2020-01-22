package com.java8.functionalinterface;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		Supplier<PersonAll> supplier = ()->{
			return new PersonAll("Name1", 20, "Delhi");
		};
		
		PersonAll person = supplier.get();
		
		System.out.println("Name : " + person.getName() +  " Age : " + person.getAge() + 
				" Address : " + person.getAddress());
		
	}
	
}
