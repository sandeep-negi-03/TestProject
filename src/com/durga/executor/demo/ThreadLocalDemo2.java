package com.durga.executor.demo;

public class ThreadLocalDemo2 {

	public static void main(String[] args) {
		CustomerThread c1 = new CustomerThread("Thread-1");
		CustomerThread c2 = new CustomerThread("Thread-2");
		CustomerThread c3 = new CustomerThread("Thread-3");
		CustomerThread c4 = new CustomerThread("Thread-4");
		CustomerThread c5 = new CustomerThread("Thread-5");
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
	}

}

class CustomerThread extends Thread {
	static Integer custId = 0;

	private static ThreadLocal tl = new ThreadLocal() {
		protected Integer initialValue() {
			return ++custId;
		}
	};

	public CustomerThread(String name) {
		super(name);
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " Executing : " + tl.get());
	}

}