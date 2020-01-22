package com.ad.test;

public class Test14 extends CustomTest{

	public static void main(String[] args) {
		
		CustomTest test = new Test14();
		test.setTestName("New Test");
		System.out.println(test.getTestName());
	}
	
}

class CustomTest{
	private String name;

	public String getTestName() {
		return name;
	}

	public void setTestName(String tName) {
		name = tName;
	}
	
}