package com.java.tricky;

import java.math.BigDecimal;

public class DoubleSubtractionTest {
	public static void main(String[] args) {

		double d = 1.00 - 0.9;

		if (d == 0.10) {
			System.out.println("Hi");
		} else {
			System.out.println("Hello");
		}

		
		System.out.println(new BigDecimal("1.00").subtract(new BigDecimal("0.9")).doubleValue());
		System.out.println(new BigDecimal(0.09));
	}

}
