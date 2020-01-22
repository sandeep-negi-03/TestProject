package com.java.tricky;

import java.util.Random;

public class StrinBufferSwitchTest {

	private static Random rd = new Random();

	public static void main(String[] args) {

		StringBuffer sb = null;
System.out.println(rd.nextInt(5));
		switch (rd.nextInt(5)) {
		case 1:
			sb = new StringBuffer('P');
		case 2:
			sb = new StringBuffer('G');
		default:
			sb = new StringBuffer('M');
		}

		sb.append("a");
		sb.append("i");
		sb.append("n");

		System.out.println(sb);
		System.out.println(sb.capacity());

	}
}
