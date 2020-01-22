package com.nc.test;

public class TestInheritReference {

	public static void main(String[] args) {
		Aa a = new B();
		 a.method("");
		 
		 B b = new B();
		 b.method(null);
		 b.method("");
			
	}

}


class Aa{
	void method(Object obj){
		System.out.println("A class method");
	}
}

class B extends Aa{
	
	void method(Object obj){
		System.out.println("B class method");
	}
	
	void method(String S){
		System.out.println("B String Invoked");
	}
}