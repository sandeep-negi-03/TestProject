package com.ad.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Check which remove function will work fine
 * @author SandeepN
 *
 */
public class Test7 {

	public static void main(String[] args) {
		int[] intArray = {89,23,32,4,5,6,7,8,9};
		List<Integer> integerList = new ArrayList<>();
		for(int i: intArray){
			integerList.add(i);
		}
		System.out.println(integerList);
		//remove1(integerList, 5); java.util.ConcurrentModificationException
		remove2(integerList, 4); // correct way to remove a number 
	}

	private static void remove2(List<Integer> numbers, int num) {

		for(Iterator<Integer> iter = numbers.iterator();iter.hasNext();){
			int nextNum = iter.next();
			if(nextNum==num){
				iter.remove();
			}
		}
		System.out.println("Number list in remove2 : " + numbers);
	}

	private static void remove1(List<Integer> numbers, int num) {
		for(Iterator<Integer> iter = numbers.iterator();iter.hasNext();){
			int nextNum = iter.next();
			if(nextNum == num){
				numbers.remove(num);
			}
		}
		
	}
	
}
