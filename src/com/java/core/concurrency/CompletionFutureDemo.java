package com.java.core.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletionFutureDemo {
	
	public static void main(String[] args) {
		
		CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
		        // Simulate a long-running Job
		        try {
		            Thread.sleep(1);
		        } catch (InterruptedException e) {
		            throw new IllegalStateException(e);
		        }
		        System.out.println("I'll run in a separate thread than the main thread.");
		    });
					
		try {
			future.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Run a task specified by a Supplier object asynchronously
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(new Supplier<String>() {
		    public String get() {
		        try {
		            Thread.sleep(1000);
		        } catch (InterruptedException e) {
		            throw new IllegalStateException(e);
		        }
		        return "Result of the asynchronous computation";
		    }
		});
		
		
		try {
			String result = future2.get();
			System.out.println(result);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}
	

}
