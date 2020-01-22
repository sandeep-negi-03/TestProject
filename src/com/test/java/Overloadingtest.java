package com.test.java;

public class Overloadingtest {
			public static void main(String[] args) {
				char arr[] = {'a','b'};
				accept(arr);
				
				accept("string");
				
				Overloaded overloaded = new Overloaded();
				overloaded.accept(arr);
				overloaded.accept("string");
				
			}
			
			public static void accept(char[] arr) {
				System.out.println(arr);
			}
			
			public static void accept(String s) {
				System.out.println(s);
			}
}

class Overloaded{
	public void accept(char[] arr) {
		System.out.println(arr);
	}
	
	public void accept(String s) {
		System.out.println(s);
	}
}
