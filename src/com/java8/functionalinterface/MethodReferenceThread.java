package com.java8.functionalinterface;

public class MethodReferenceThread {

	public static void main(String[] args) {
		Thread t = new Thread(()-> {
				System.out.println("Hi");
		});
		t.start();
		
		Thread t1 = new Thread(MethodReferenceThread::execute);
		Thread t2 = new Thread(MethodReferenceThread::execute);
		t1.start();
		t2.start();
		
	}

	
	public static void execute() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello---" + i + Thread.currentThread().getName());
		}
	}
}
