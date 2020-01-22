package com.test.java;

public class StaticTest {

	public static void main(String[] args) {
		Reference st = new Reference();
		st.staticMethod();
//		staticMethod();
		System.out.println(st.staticMember);
//		System.out.println(staticMember);
	}

}

class Reference {

	{
		System.out.println("ano block");
	}

	final static String staticMember = "abc";

	public static int staticMethod() {
		System.out.println("Inside Static method");
		return 1;
	}

	static {
		System.out.println("static block");
	}

}