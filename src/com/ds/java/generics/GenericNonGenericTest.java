package com.ds.java.generics;

import java.util.ArrayList;

public class GenericNonGenericTest {

	public static void main(String[] args) {
		
		ArrayList<String> strList = new ArrayList<>();
		
		strList.add("sandeep");
		strList.add("Negi");
		
		System.out.println("Before calling nonGeneric Method : " + strList);
		
		nonGeneric(strList);
		
		System.out.println("After calling nonGeneric Method : " + strList);
		
		
	}

	public static void nonGeneric(ArrayList l){
		l.add(10);
		l.add(20);
		
		System.out.println("List in non generic : " + l);
	}
	
}
