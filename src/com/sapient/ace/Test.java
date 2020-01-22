package com.sapient.ace;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test  {
	
	
	public static void main(String[] args) {
	
		Map<String, String> map = new HashMap<String, String>();
		
		map.put(null,"HI");
		map.put(null,"Hello");
		map.put(null,"C");
		map.put(null,"D");
		
		System.out.println(map);
		
		
		int[] array = {10,20,30,40,50};
		int[] newArray = Arrays.stream(array).map(i-> i*i).toArray();
		for (int j : newArray) {
			System.out.print(j + " ");
		}

		long sum = Arrays.stream(array).map(i-> i*i).summaryStatistics().getSum();
		System.out.println("\n Sum : " + sum);
	}
}

