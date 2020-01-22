package com.durga.executor.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		PrintJob [] jobs = {new PrintJob("One"), new PrintJob("Two") ,
				new PrintJob("Three"), new PrintJob("Four"), new PrintJob("Five"),
				new PrintJob("Six")};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(PrintJob job :jobs){
			service.submit(job);
		}
		service.shutdown();
	}

}


class PrintJob implements Runnable{
	
	String name;
	
	public PrintJob(String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.println(name + " : Job Started by Thread : " + Thread.currentThread().getName());
		try{
			Thread.sleep(2000);
		}catch(InterruptedException ie){}
		System.out.println(name + " : Job Completed by Thread : " + Thread.currentThread().getName());
	}
}