package com.sapient.sampletest;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class SecondSmallestFromArray {

	public static void main(String[] args) {
		
		CompletableFuture<Void> future = CompletableFuture.runAsync(new Runnable() { 
			@Override
		    public void run() {
	        // Simulate a long-running Job
	        try {
	           Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            throw new IllegalStateException(e);
	        }
	        System.out.println("I'll run in a separate thread than the main thread.");
	    }
	});
		try {
			future.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
