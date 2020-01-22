package com.java.core.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

public class SemaphoreDemo {

	public static void main(String[] args) throws InterruptedException{
		Semaphore semaphore = new Semaphore(3);
		
		ExecutorService service = Executors.newFixedThreadPool(50);
		IntStream.of(1000).forEach(i->service.execute(new Task(semaphore)));
		
	}
	
	static class Task implements Runnable{
		
		public Task(Semaphore semaphore) {
			// TODO Auto-generated constructor stub
		}

		@Override
		public void run() {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}
}
