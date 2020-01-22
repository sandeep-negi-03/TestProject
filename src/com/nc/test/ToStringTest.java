package com.nc.test;

public class ToStringTest {
	
public static void main(String[] args) {
	System.out.println(new A());
}
}


class A{
	public String toString(){
//		System.out.println("Running" + this); java.lang.StackOverflowError
		return " Hi ";
	}
	
	@Override
	public boolean equals(Object var1) {
		System.out.println("Object method called");
		return super.equals(var1);
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called");
		super.finalize();
	}
}