package com.java.innerclass;

public class InnerClassMethodDemo {

	class Inner{
		public void m1() {
			System.out.println("m1");
		}
		
	}
	
	public static void main(String[] args) {
		
		InnerClassMethodDemo outer = new InnerClassMethodDemo();
		InnerClassMethodDemo.Inner inner = outer.new Inner();
		
		InnerClassMethodDemo.Inner inner2 = new InnerClassMethodDemo().new Inner();
		
		inner.m1();
		inner2.m1();
		
	}

}
