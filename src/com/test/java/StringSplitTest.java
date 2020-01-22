package com.test.java;

import java.util.Arrays;

public class StringSplitTest {

	public static void main(String[] args) {

		String s = "tans1|client1|RELIND|BUY|01/06/2019|1000|Y" ; 
		
		String[] split = s.split("\\|");
		System.out.println(Arrays.toString(split));
		
	}
}
