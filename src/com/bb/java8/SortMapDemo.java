package com.bb.java8;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortMapDemo {

	public static void main(String[] args) {
		
		HashMap<Number, String> map =  new HashMap<Number, String>();
		map.put(1, "One");
		map.put(4, "Four");
		map.put(6, "Six");
		map.put(9, "Nine");
		
		System.out.println("HashMap : " + map);
		
		Map<Number, String> sortedMap =  map.entrySet().stream().sorted(comparingByValue())
		        .collect(
		                toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
		                    LinkedHashMap::new));
		
		sortedMap.entrySet().forEach(System.out::println);
		
		Map<Number, String> sortedMap2 =  map.entrySet().stream().sorted(comparingByValue())
		        .collect(
		                toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1,
		                    LinkedHashMap::new));
		
		sortedMap2.entrySet().forEach(System.out::println);
	}
	
}
