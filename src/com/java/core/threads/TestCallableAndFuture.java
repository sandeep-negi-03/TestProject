package com.java.core.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 
 * @author SandeepN java.util.concurrent.The callable object can return the
 *         computed result done by a thread in contrast to a runnable interface
 *         which can only run the thread. The Callable object returns a Future
 *         object which provides methods to monitor the progress of a task being
 *         executed by a thread. The future object can be used to check the
 *         status of a Callable and then retrieve the result from the Callable
 *         once the thread is done. It also provides timeout functionality
 */

public class TestCallableAndFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newSingleThreadExecutor();

		System.out.println("Factorial Service called for 10!");
		Future<Long> result10 = executorService.submit(new FactorialService(10));

		System.out.println("Factorial Service called for 20!");
		Future<Long> result20 = executorService.submit(new FactorialService(20));

		Long factorial10 = result10.get();
		System.out.println("factorial10 :" + factorial10);

		Long factorial20 = result20.get();
		System.out.println("factorial20 :" + factorial20);

		executorService.shutdown();
	}

	static class FactorialService implements Callable<Long> {

		private int number;

		public FactorialService(int number) {
			this.number = number;
		}

		@Override
		public Long call() throws Exception {
			return factorial();
		}

		private Long factorial() throws InterruptedException {
			long result = 1;
			while (number != 0) {
				result = number * result;
				number--;
				Thread.sleep(100);
			}
			return result;
		}
	}
}
