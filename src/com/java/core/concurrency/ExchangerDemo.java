package com.java.core.concurrency;

import java.util.concurrent.Exchanger;

public class ExchangerDemo implements Runnable{

	Exchanger exchanger = null;
	Object object = null;
	
	public ExchangerDemo(Exchanger exchanger, Object object) {
		this.exchanger = exchanger;
		this.object = object; 
	}
	
	@Override
	public void run() {
	try {
		Object previous = this.object;
		this.object = this.exchanger.exchange(this.object);
		
		System.out.println(Thread.currentThread().getName() + 
		" exchanged " + previous + " for " + this.object);
		
		
		
	}catch(InterruptedException ie) {
		ie.printStackTrace();
	}
		
	}
}
