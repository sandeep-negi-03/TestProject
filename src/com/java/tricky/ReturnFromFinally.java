package com.java.tricky;

import java.io.IOException;

public class ReturnFromFinally {

	public static void main(String[] args) {
		System.out.println(returnInteger());
	}
	
	public static int returnInteger() {
		
		try {
			throw new IOException();
		}
		finally{
			return 0;
		}
	}
}


	