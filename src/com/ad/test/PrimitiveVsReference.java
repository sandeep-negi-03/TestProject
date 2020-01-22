package com.ad.test;

public class PrimitiveVsReference {
	private static class Counter {
		private int count;

		public void advance(int number) {
			count += number;
		}

		public int getCount() {
			return count;
		}
	}

	public static void main(String args[]) {
		int i = 30;
		System.out.println("value of i before passing to method : " + i);
		print(30);
		System.out.println("value of i after passing to method : " + i);
		Counter myCounter = new Counter();
		System.out.println("counter before passing to method : " + myCounter.getCount());
		print(myCounter);
		System.out.println("counter after passing to method : " + myCounter.getCount());
	}

	/* * print given reference variable's value */
	public static void print(Counter ctr) {
		ctr.advance(2);
	}

	/** * print given primitive value */
	public static void print(int value) {
		value++;
	}
}
