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
		InterA i = (a,b)->System.out.println("Sum is : " + (a+b) );
		
		i.add(10, 20);
		i.d1();
		InterA.s1();
		
		InterB j = (a,b)->System.out.println("Sum is : " + (a+b) );
		j.add(100, 200);
		j.d1();
		
		InterB objb = new TestInterface();
		objb.d1();

		InterA obja = new TestInterface();
		obja.d1();
	}
	
	@Override
	public void add(int a, int b) {
		
	}

	@Override
	public void d1() {
		// TODO Auto-generated method stub
		InterA.super.d1();
	}
}
