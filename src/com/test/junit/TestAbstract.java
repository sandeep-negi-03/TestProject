package com.test.junit;


abstract class AbstractA{
	void printA(){
		 System.out.println("HelloA");
	}
	
}

abstract class AbstracB{
	void printB(){
		System.out.println("HelloB");
	}
}

public class TestAbstract extends AbstractA{
public static void main(String[] args) {
	 new TestAbstract().printA();
}
}
