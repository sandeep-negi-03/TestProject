package com.bb.java8;

public class LamdaLocalVariableDemo{

	int x = 888;
	
	public void m2() {
		Intref i = ()->{
			int x = 999;
			System.out.println(this.x);
			System.out.println(x);
		};
		i.m1();
	}
	
	public static void main(String[] args) {
		LamdaLocalVariableDemo t = new LamdaLocalVariableDemo();
		t.m2();
	}
	
}

interface Intref{
	public void m1();
}