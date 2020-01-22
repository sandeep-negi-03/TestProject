package com.sorting.algorithm;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTest {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		System.out.println(binarySearch(numbers, 4));
	}

	public static boolean binarySearch(final List<Integer> numbers, final Integer value) {
		if (numbers == null || numbers.isEmpty()) {
			return false;
		}
		final Integer comparison = numbers.get(numbers.size() / 2);
		if (value.equals(comparison)) {
			return true;
		}
		if (value < comparison) {
			return binarySearch(numbers.subList(0, numbers.size() / 2), value);
		} else {
			return binarySearch(numbers.subList(numbers.size() / 2 + 1, numbers.size()), value);
		}
	}

}
