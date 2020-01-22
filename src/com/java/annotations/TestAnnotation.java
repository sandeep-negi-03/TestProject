package com.java.annotations;

class Base {
	public void method1() {
		System.out.println("Base method1");
	}
}

public class TestAnnotation {

	@Copyright("Copyright with sandeep")
	public static void main(String[] args) {
		System.out.println("Hello");
		
		TestAnnotation test = new TestAnnotation();
		test.method1("Hi");
	}

	private void method1(String string) {
		System.out.println(string);
	}
	
	
}
