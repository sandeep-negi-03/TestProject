package com.bb.java8;

import java.util.StringJoiner;

public class StringJoinerTest {
	
	public static void main(String[] args) {
		
		StringJoiner stringJoiner = new StringJoiner("-");
		stringJoiner.setEmptyValue("");
		System.out.println("initial setEmptyValue : " + stringJoiner);
		System.out.println("Checking Length : " + stringJoiner.length());

		stringJoiner.add("first");
		stringJoiner.add("second");
		stringJoiner.add("Third");
		System.out.println("StringJoiner add : " + stringJoiner );
		
		stringJoiner.setEmptyValue("second Empty");
		System.out.println("Second Empty : " + stringJoiner);
		
		StringJoiner stringJoiner2 = new StringJoiner(",", "\"", "\"");
		stringJoiner2.setEmptyValue("emptyValue2");
		System.out.println("stringJoiner2 EmptyValue : " + stringJoiner2);
		
		stringJoiner2.add("fourth");
		stringJoiner2.add("fifth");
		System.out.println("stringJoiner2 : " + stringJoiner2);
		
		System.out.println("Merge result : " + stringJoiner.merge(stringJoiner2));
		System.out.println("String Joiner toString : " + stringJoiner.toString());
		String string = stringJoiner.merge(stringJoiner2).toString();
		System.out.println("Test toString : " + string);
		
		

		
	}
	

}
