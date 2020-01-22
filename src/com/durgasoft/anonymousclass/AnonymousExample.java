package com.durgasoft.anonymousclass;

public class AnonymousExample {

	public static void main(String[] args) {

		// anonymous class inside method
		Hello h = new Hello("abc") {

			@Override
			public void sayHello() {
				System.out.println("Hello anonymous class " + s);
			}
		};

		h.sayHello();

	}

}
