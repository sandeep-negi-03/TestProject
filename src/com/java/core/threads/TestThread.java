package com.java.core.threads;

public class TestThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Running thread: " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		TestThread testThread = new TestThread();
		Thread t1 = new Thread(testThread);
		Thread t2 = new Thread(testThread);
		Thread t3 = new Thread(testThread);
		t1.setName("t1");
		t1.start();
		t2.setName("t2");
		t2.start();
		t3.setName("t3");
		t3.start();
		t2.start();
		
		t1.join();
		
	}
	
	
}


