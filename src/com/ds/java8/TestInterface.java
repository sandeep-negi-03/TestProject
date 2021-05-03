package com.ds.java8;


interface InterA{
	void add(int a, int b);

	static void s1(){
		System.out.println("Interface A static method");
	}
	
	default void d1(){
		System.out.println("Interface A default method");
	}
	
}

interface InterB{
	void add(int a, int b);

	static void s1(){
		System.out.println("Interface B static method");
	}
	
	default void d1(){
		System.out.println("Interface B default method");
	}
	
}

public class TestInterface implements InterA, InterB{
	
	public static void main(String[] args) {
		InterA inta = (a,b)->System.out.println("Sum is : " + (a+b) );
		
		inta.add(10, 20);
		inta.d1();
		InterA.s1();
		
		InterB intb = (a,b)->System.out.println("Sum is : " + (a+b) );
		intb.add(100, 200);
		intb.d1();
		
		
		InterB objb = new TestInterface();
		objb.d1();
		InterB.s1();

		InterA obja = new TestInterface();
		obja.d1();
	}

	@Override
	public void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}
	
	@Override
	public void d1() {
		System.out.println("TestInterface Class d1 implementation");
	}
	
}
