package com.test.nagarro;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

/**
 * create a program to output the number of occurrence of a character with the
 * character ex abaabbbbccd - a3b5c2d1
 *
 */

public class CharacterCount {

	public static void main(String[] args) {
		System.out.println(getCharCount("abaabbbbccd"));
		long memory = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024;
		System.out.println(memory);
	}

	private static String getCharCount(String string) {
		StringBuilder sb = new StringBuilder();
		Map<String, Integer> map = new HashMap<>();
		char[] strArray = string.toCharArray();
		for (int i = 0; i < strArray.length; i++) {

			if (!map.containsKey(String.valueOf(strArray[i]))) {
				map.put(String.valueOf(strArray[i]), 1);
			} else if (map.containsKey(String.valueOf(strArray[i]))) {
				map.put(String.valueOf(strArray[i]), (map.get(String.valueOf(strArray[i]))) + 1);
			}
		}

		for (Entry<String, Integer> entry : map.entrySet()) {
			sb.append(entry.getKey().concat(String.valueOf(entry.getValue())));
		}
		return sb.toString();
	}
}