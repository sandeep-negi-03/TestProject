package com.ad.test;

public class Test15 {

	public void foo(){
		try{
			throw new RuntimeException();
		}finally{
			System.out.println("In Finally Block");
		}
	}
	public static void main(String[] args) {
		try{
			Test15 test = new Test15();
			test.foo();
			System.out.println("Finished Running");
		}catch(Exception e){
			
		}
	}
	

}
