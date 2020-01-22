package com.test.java;

public class TestObject {

	class abc{
		
	}
	
	public static void main(String[] args) {
		
		abc obj1 = new TestObject().new abc();
		abc obj2 = new TestObject().new abc();
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1 == obj2);
		
	}
	
}
