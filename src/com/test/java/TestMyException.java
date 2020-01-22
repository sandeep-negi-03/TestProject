package com.test.java;

public class TestMyException {

	public static void main(String[] args) throws MyException2, MyException1 {

		try {
			throw new MyException1("Hi");
		} catch (MyException1 e) {
			System.out.println(e.getMessage());
		}
	}

}

class MyException1 extends Exception {
	public MyException1(String msg) {
		super(msg);
	}

}

class MyException2 extends Exception {
}