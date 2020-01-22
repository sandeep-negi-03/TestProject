package com.ad.test;

public class Test11 {

	private String name;
	
	public Test11(String name){
		super();
		this.setName(name);
	}

	public static void main(String[] args) {
		Test11 car = new Test11("Honda");
		foo(car);
		System.out.println(car.getName().equals("Kia"));
	}
	
	
	public static void foo(Test11 car){
		System.out.println(car.getName().equals("Honda"));
		car.setName("Kia");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
