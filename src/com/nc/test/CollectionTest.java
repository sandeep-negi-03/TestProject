package com.nc.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionTest {

	
	public static void main(String[] args) {
		List<String> list =new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println("Size : " + list.size());
		Collection c = new ArrayList<>();
		c.remove(0);
		
		for(String s:list) {
			if(s.equals("B")) {
				list.remove("B");
			}
		}
		
		System.out.println("Size : " + list.size());
		
	}
}
