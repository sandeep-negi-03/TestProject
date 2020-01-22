package com.ds.java.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericCompileTest {

	public static void main(String[] args) {
		
		List l = new ArrayList<String>();
		l.add(10);
		l.add(20);
		
		System.out.println(l);
		
		
		List<String> l2 = new ArrayList();
		l2.add("null");
//		l2.add(10);	The method add(int, String) in the type List<String> is not applicable for the arguments (int)	
		
	}
}
