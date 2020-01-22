package com.java.tricky;

public class TurnaryNullTest {

	public static void main(String[] args) {
		int x  = TurnaryNullTest.foo(30);
		System.out.println(x);
	}
	
	static int foo(int i){
		return (i<10?null :i); // null pointer exception if less than 10
	}
	
}
