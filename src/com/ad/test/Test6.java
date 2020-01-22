package com.ad.test;

public class Test6 {
	
	public static void foo(){
		try{
			throw new Exception();
		}catch(MyException me){
			System.out.println("In MyException");
		}catch(Exception e){
			System.out.println("In Exception");
		}
	}
	
	public static void main(String[] args) {
		foo();
	}
}
class MyException extends Exception{}