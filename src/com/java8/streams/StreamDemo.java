package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Sandeep");
		list.add(null);
		list.add("");
		
		list = list.stream().filter(i->i!=null && !i.equals("")).collect(Collectors.toList());
		
		System.out.println(list);
		
	}
	
}
