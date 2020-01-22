package com.java.tricky;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FabonnaciTest {

	public static void main(String[] args) {
		System.out.println(fibonacci(8));

		System.out.println("N = " + fibN(6));

	}

	public static List<Integer> fibonacci(int n) {

		if (n < 0) {
			throw new IllegalArgumentException("n must not be less than zero");
		}
		if (n == 0)

		{
			return new ArrayList<>();
		}
		if (n == 1) {
			return Arrays.asList(0);
		}
		if (n == 2) {
			return Arrays.asList(0, 1);
		}

		final List<Integer> seq = new ArrayList<>(n);
		seq.add(0);
		n = n - 1;
		seq.add(1);
		n = n - 1;
		while (n > 0) {

			int a = seq.get(seq.size() - 1);
			int b = seq.get(seq.size() - 2);
			seq.add(a + b);
			n = n - 1;

			System.out.println(seq);
		}

		return seq;
	}

	/**
	 * A recursive algorithm for finding the nth Fibonacci number
	 * 
	 * @param n
	 * @return
	 */
	public static int fibN(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("n must not be less than zero");
		}
		if (n == 1)
			return 1;
		if (n == 0)
			return 0;
		return (fibN(n - 1) + fibN(n - 2));
	}
}
