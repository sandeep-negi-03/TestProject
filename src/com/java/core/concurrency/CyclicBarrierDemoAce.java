package com.java.core.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemoAce {
	
	public static void main(String[] args) {
		
		Runnable action = new Runnable() {
			
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.printf("Thread %s " + "executing barrier. %n ", name);
			}
		};
		
		final CyclicBarrier barrier = new CyclicBarrier(3, action);
		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.printf("%s is about to join game.... %n", name);
				try {
					barrier.await();
				}catch (BrokenBarrierException be) {
					System.out.println("Barrier is broken");
					return;
				}catch(InterruptedException ie) {
					System.out.println("Thread Interrupted");
					return;
				}
				System.out.printf("%s has joined the game ... %n", name);
			}
		};
		
		ExecutorService[] executors = new ExecutorService[] {
				Executors.newSingleThreadExecutor(), Executors.newSingleThreadExecutor() 
		};
		
		for(ExecutorService excuter : executors) {
			excuter.execute(task);
			excuter.shutdown();
		}
		
	}

}
