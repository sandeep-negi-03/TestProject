package com.java.tricky;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomTest {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		for(int i=0;i<100;i++){
			set.add(randomInteger());
		}
		
		System.out.println(set.size());
		
	}

	private static Integer randomInteger() {
		return new Random(123456789L).nextInt();
	}

}
