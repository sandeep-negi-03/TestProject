package com.ad.test;

public class Test5 {

	int a =10;
	int b = 20;
	public static void main(String[] args) {
		int first = 100;
		int second = 200;
		swapValues(first,second);
		Test5 test5 = new Test5();
		test5.swapValues2(test5.a, test5.b);
		System.out.println("a" + test5.a);
		System.out.println("b" + test5.b);
		System.out.println(first);
		System.out.println(second);
	}

	private static void swapValues(int first, int second) {
		int temp = first;
		first = second;
		second = temp;
		System.out.println("Inside swap: " + first + " " + second);
	}
	private static void swapValues2(int first, int second) {
		Test5 test5 = new Test5();
		int temp = first;
		test5.a = second;
		test5.b = temp;
		System.out.println("Inside swap2: " + test5.a + " " + test5.b);
	}
}

//check the result