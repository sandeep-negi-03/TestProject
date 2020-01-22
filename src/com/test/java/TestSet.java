package com.test.java;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String args[]){
		Set<String> hs = new HashSet<>();
		hs.add("a");
		hs.add("b");
		hs.add("c");
		
		
		Set<String> hs2 = new HashSet<>();
		hs2.add("a");
		hs2.add("b");
		hs2.add("c");
		
		System.out.println("Equals : " + hs.equals(hs2));
		
		
	}
}