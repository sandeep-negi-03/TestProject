package com.java.exception;

import java.io.IOException;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

}



 class TestException4 {

	public void start() throws IOException{		
	}
	
	public void foo() throws NullPointerException{
		
	}
}

class TestException5 extends TestException4{
	
//	public void start() throws Exception{
//	}
	
	public void foo() throws RuntimeException{
		
	}
}
