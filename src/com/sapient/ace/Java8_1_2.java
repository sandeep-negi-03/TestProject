package com.sapient.ace;

import java.util.Arrays;

/**
 * Write a program using streams to remove all odd numbers and then square the result and print the sum of all squares.
	Change the code to not use the first 3 even numbers
 * @author sannegi6
 *
 */

public class Java8_1_2 {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		
		System.out.println( Arrays.stream(arr).filter(i->i%2==0).map(i->i*i).sum());
	
		System.out.println( Arrays.stream(arr).filter(i->i%2==0).skip(3).map(i->i*i).sum());
		
		//		Calculate average in an array list
		
		System.out.println(Arrays.stream(arr).average().getAsDouble());
		
	}
	
}
