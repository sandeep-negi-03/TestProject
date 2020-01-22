package com.durgasoft.anonymousclass;

public class Hello {

	protected String s;
	
	public Hello(String str){
		this.s = str;
	}
	public void sayHello(){
		System.out.println(s);
	};
	
	void foo(){};
}