package com.ds.java.generics;

import java.math.BigInteger;

public class TestGenerics {

	static BigInteger a ;
	
	// In the below 2 methods, only Data Type which extends Number are allowed.
	public static <T extends Number> double addStaticMethod(T a, T b) {
		return a.doubleValue() + b.doubleValue();
	}

	public <T extends Number> double addInstanceMethod(T a, T b) {
		return a.doubleValue() + b.doubleValue();
	}

	public static void main(String[] args) {
		// static method invocation with Type Argument. It is type safe, only
		// Integer is allowed.
		System.out.println(TestGenerics.<Integer> addStaticMethod(3, 4));
		// static method invocation without Type Argument, not type safe. Both
		// Integer and Float is allowed.
		System.out.println(addStaticMethod(3, 4.3));

		TestGenerics m = new TestGenerics();
		// Instance method invocation with Type Argument.
		System.out.println(m.<Double> addInstanceMethod(3.2, 4.5));
		
		System.out.println(a);
	}

}
