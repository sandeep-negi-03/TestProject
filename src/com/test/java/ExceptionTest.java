package com.test.java;

import java.util.ArrayList;

public class ExceptionTest {

	public static void main(String[] args) {
		
		
		System.out.println("Check Error");
		Calculate();
	}
	
	static void Calculate(){
		try{
			
			System.out.println("Divide : " + 10/1);
			String [] astArray = new String[5];
			astArray[1]="Hi";
			System.out.println(astArray.length);
			System.out.println(astArray[20]);
			
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
			System.out.println("In Exception");
			e.printStackTrace();
		}
	}
	
}
