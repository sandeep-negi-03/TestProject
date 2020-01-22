package com.java.collection;

import java.util.HashMap;

public class HashMapOrderTest {

	public static void main(String[] args) {
		
		HashMap<String , String> map =  new HashMap<String, String>();
		
		for(int i=0;i<20;i++) {
		map.put("Number" + i, "Number" + i);
		}
		
		System.out.println(map);
	}
		
	
}
