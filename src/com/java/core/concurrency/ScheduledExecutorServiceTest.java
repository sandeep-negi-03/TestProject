package com.java.core.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceTest {

	private static int count;

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

		Callable<Integer> call = () -> 10;

		Runnable runnable = () -> {

			count++;
			System.out.println("Running...task1 - count : " + count);
		};

		task1();

		ScheduledFuture<Integer> schedule = executor.schedule(call, 5, TimeUnit.SECONDS);

		ScheduledFuture<?> scheduleAtFixedRate = executor.scheduleAtFixedRate(runnable, 2, 1, TimeUnit.SECONDS);

		while (true) {
			System.out.println("count :" + count);
			Thread.sleep(1000);
			if (count == 5) {
				System.out.println("Count is 5, cancel the scheduledFuture!");
				scheduleAtFixedRate.cancel(true);
//                ses.shutdown();
				break;
			}
		}

		task3();

		System.out.println(schedule.get());

//		scheduleAtFixedRate.get();

		System.out.println("initiating shutdown");

		executor.shutdown();

		System.out.println("Is executor shutdown : " + executor.isShutdown());
	}

	public static void task1() {
		System.out.println("Running task1...");
	}

	public static void task3() {
		System.out.println("Running task3...");
	}
}
