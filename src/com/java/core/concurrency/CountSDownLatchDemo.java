package com.java.core.concurrency;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountSDownLatchDemo {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		
		CountDownLatch latch =  new CountDownLatch(3);
		
		executorService.submit(new DependentService(latch));
		executorService.submit(new DependentService(latch));
		executorService.submit(new DependentService(latch));
		executorService.submit(new DependentService(latch));
		executorService.submit(new DependentService(latch));
		
		latch.await();
		
		System.out.println("All dependent service initialized");
//		Thread.sleep(1);
		System.out.println("After sleep");
	}
	
	public static class DependentService implements Runnable{
		
		private CountDownLatch latch;
		public DependentService(CountDownLatch latch) {
			this.latch = latch;
		}
		
		@Override
		public void run() {
			
			System.out.println("Before CountDown : " + latch.getCount());
			latch.countDown();
			System.out.println("After CountDown : " + latch.getCount());
			
		}
		
	}
	
}
