package com.java.core.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemo {
	
	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(4);
		
		CyclicBarrier barrier = new CyclicBarrier(3);
		service.submit(new Task(barrier));
		service.submit(new Task(barrier));
		service.submit(new Task(barrier));
		service.submit(new Task(barrier));
		service.submit(new Task(barrier));
		
		Thread.sleep(1000);
		
		System.out.println("All messages sent");
	}
	
	public static class Task implements Runnable{
		
		private CyclicBarrier barrier;
		public Task(CyclicBarrier barrier) {
			this.barrier = barrier;
		}
		
		@Override
		public void run() {

			while(true) {
				try {
					barrier.await();
				}catch (InterruptedException | BrokenBarrierException e) {
					e.getMessage();
				}
				System.out.println("Send Message " + barrier.getParties());
			}
			
		}
	}

}
