

package com.test.java;

public class TestString {

	public static void main(String[] args) {
		String s1 = new String("a");
		String s2 = new String("a");
		String s3 = "a";
		String s4 = "a";
		
		StringBuffer sb = new StringBuffer("s1");
		StringBuffer sb1 = sb;
		StringBuffer sb2 = new StringBuffer("s1");
		
		System.out.println(sb==sb1);
		
		System.out.println(sb.equals(sb2));
		System.out.println(sb==sb2);
		
		System.out.println(s1==s2);//f
		System.out.println(s1.equals(s2));//t
		System.out.println(s1==s3);//f
		System.out.println(s3==s4);//f
		System.out.println(s3.equals(s4));//t
		
		
		
	}
	
	
}
