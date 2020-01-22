package com.ad.test;

public class Test17 extends CustomTest17 {

	public Test17() {
		super("");
	}

	public static void main(String[] args) {
		System.out.println("Run success " + new Test17());
	}
}


class CustomTest17{
	private String customTestName;
	
	public CustomTest17(String customTestName){
		this.setCustomTestName(customTestName);
	}

	public String getCustomTestName() {
		return customTestName;
	}

	public void setCustomTestName(String customTestName) {
		this.customTestName = customTestName;
	}
	
	
}