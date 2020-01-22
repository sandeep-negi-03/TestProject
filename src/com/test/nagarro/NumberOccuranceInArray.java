package com.test.nagarro;

/**
 * There will be an input array and an input number , find if the number is the
 * most occurred number Criteria for most occurred number is -- -- The number
 * occurrence should be greater than the half of the size of array -- If there
 * is a negative number in the input array it will not be counted
 */

public class NumberOccuranceInArray {

	public static void main(String[] args) {

		int[] inputArray = { 2, 3, 1, 3, 1, 2, 2, 2, 2, 2 };
		System.out.println(findMostOccurred(2, inputArray));
		
		int[] inputArray1 = { 2, 3, 1, 3, 1, 2, 2, 2, 2, 2 };
		System.out.println(findMostOccurred(3, inputArray1));

	}

	private static boolean findMostOccurred(int input, int[] inputArray) {
		int count = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if (input == inputArray[i]) {
				count++;
			}
			if (count > (inputArray.length / 2)) {
				return true;
			}
		}
		return false;
	}

}
