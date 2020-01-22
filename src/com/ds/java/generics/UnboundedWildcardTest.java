package com.ds.java.generics;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcardTest {


	public static void main(String[] args) {
		List<?> stuff = new ArrayList<>();
		// stuff.add("abc");
		// stuff.add(new Object());
		// stuff.add(3);
		int numElements = stuff.size();
		System.out.println("numElements : "+ numElements);
		
		List<String> strList = new ArrayList<>();
		strList.add("str1");
		strList.add("str2");
		strList.add("str3");

	
		List<Number> nbrList = new ArrayList<>();
		nbrList.add(1);
		nbrList.add(2);
		nbrList.add(3);
		
		addList(strList);
		addList(nbrList);
		
}
	
	static void addList(List<?> list){
		System.out.println(list);
	}
	
}
