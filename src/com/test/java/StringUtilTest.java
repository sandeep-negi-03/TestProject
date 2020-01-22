package com.test.java;

import org.apache.commons.lang.StringUtils;

public class StringUtilTest {

	public static void main(String[] args) {
		
		System.out.println(StringUtils.isNotEmpty(null));
		System.out.println(StringUtils.isNotEmpty(""));
		System.out.println(StringUtils.isNotEmpty(" "));
		
	}
	
	
}
