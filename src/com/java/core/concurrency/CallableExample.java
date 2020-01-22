package com.java.core.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CallableExample {

	public static void main(String[] args) {
		ThreadPoolExecutor execute = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		
		List<Future<Integer>> resultList =  new ArrayList<Future<Integer>>();
		Random random = new Random();
		
		for(int i=0; i<4; i++) {
			Integer number = random.nextInt(10);
			FactorialExample factorialExample = new FactorialExample(number);
			Future<Integer> result = execute.submit(factorialExample);
			resultList.add(result);
		}
		
		for(Future<Integer> item :resultList) {
			
			try {
				System.out.println("Future result is : " + item.get() + " :: Task Done");
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		execute.shutdown();
	}
	
}


class FactorialExample implements Callable<Integer>{

	private Integer number;
	
	public FactorialExample(Integer number) {
		this.number = number;
	}
	
	@Override
	public Integer call() throws Exception {
		int result = 1;
		
		if(number == 0 || number == 1) {
			result = 1;
		}else {
			for(int i=2;i<=number;i++) {
				result *= i;
				TimeUnit.MILLISECONDS.sleep(20);
			}
		}
		System.out.println("Result for number " + number + "->" + result);
		return result;
	}
	
	
	
}