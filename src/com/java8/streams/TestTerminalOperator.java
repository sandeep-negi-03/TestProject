package com.java8.streams;

import java.util.Arrays;

public class TestTerminalOperator {

	public static void main(String[] args) {
	    System.out.println("Stream without terminal operation");
	     
	    Arrays.stream(new int[] { 1, 2, 3 }).map(i -> {
	        System.out.println("doubling1 " + i);
	        return i * 2;
	    });
	  
	    System.out.println("Stream with terminal operation");
	        int sum = Arrays.stream(new int[] { 1, 2, 3 }).map(i -> {
	            System.out.println("doubling2 " + i);
	            return i * 2;
	    }).sum();
	        System.out.println(sum);
	}
	
}
