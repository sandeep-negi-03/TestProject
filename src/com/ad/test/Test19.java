package com.ad.test;

/**
 * Predict Output
 * @author SandeepN
 *
 */

public class Test19 {
	
	public static void main(String[] args) {
		String name = new String("Test");
		String secondName = new String("Test");
		String thirdName = "Test";
		String fourthName = "Test";
		
		System.out.println(name == secondName); //false
		System.out.println(name.equals(secondName)); //true
		System.out.println(thirdName == fourthName); //true
		System.out.println(thirdName.equals(fourthName)); //true
	}

}
